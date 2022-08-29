package step4;
public class Theater implements Runnable {
	private int seat =1; // 멀티 스레드 공유 자원
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		try {
			//reserve(threadName);
			reserve2(threadName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// 동일한 좌석이 예매될 수 있다
	public void reserve(String customer) throws InterruptedException {
		Thread.sleep(100);
		System.out.println(customer + " 님" + seat +"번 영화좌석예매");
		seat++;
		/*
		 * 아이유 님1번 영화좌석예매
			차재명 님1번 영화좌석예매
		 */
	}
	public void reserve2(String customer) throws InterruptedException {
		// 아래 영역만 동기화해서 단일 스레드 환경으로 만든다.
		synchronized (this) { // 현재객체의 인스턴스변수에 this를 걸어줌
			System.out.println(customer + " 님" + seat +"번 영화좌석예매");
			seat++;
		}
		Thread.sleep(100);
		/*
		 * 아이유 님1번 영화좌석예매
			차재명 님2번 영화좌석예매
		 */
	}
}


