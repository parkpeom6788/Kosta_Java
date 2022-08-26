package step7;

public class TestThread4 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 스레드 시작");
		Thread videoThread = new Thread(new VideoWorker(),"비디오일꾼"	);
		videoThread.start();
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
		Thread audioThread = new Thread(new AudioWorker(),"오디오일꾼");
		audioThread.start(); // 실행 가능 상태로 보냄 
	}
}
