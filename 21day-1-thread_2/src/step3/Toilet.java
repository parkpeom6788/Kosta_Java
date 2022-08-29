package step3;

public class Toilet implements Runnable	{
	private String room = "1번 화장실";
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		try {
			use(threadName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// 화장실을 사용하는 메서드는 멀티스레드가 아니라
	// 단일 스레드 환경으로 실행된다. (Thread1 실행완료 -> Thread2 ... )
	// 인스턴스변수가 공유되므로 단일스레드 환경으로 처리한다 동기화 -> synchronized
	public synchronized void use(String userName) throws InterruptedException {
		System.out.println(userName + " 입장");
		Thread.sleep(2000);
		System.out.println(userName + "님" + room + " 사용중");
		Thread.sleep(2000);
		System.out.println(userName + " 나감");
	}
}
