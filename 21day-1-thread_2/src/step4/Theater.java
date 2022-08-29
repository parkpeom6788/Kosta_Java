package step4;

public class Theater implements Runnable {
	private int seat = 1; // 멀티 스레드 공유 자원
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		try {
			reserve(threadName); // 동기화 안함
			reserve2(threadName); // 동기화 함 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void reserve(String customer) throws InterruptedException {
		Thread.sleep(100);
		System.out.println(customer + " 님" + seat + "번 영화좌석예매");
		seat++;
		/*
		 * 아이유 님 1번 영화좌석예매
		 * 차재명 님 1번 영화좌석예매
		 */
	}
	public void reserve2(String customer) throws InterruptedException {
		// 특정 영역만 동기화 영역으로 만든다
		synchronized (this) {
			System.out.println(customer + " 님" + seat + "번 영화좌석예매");
			seat++;
		}
		Thread.sleep(100);
	}
}
