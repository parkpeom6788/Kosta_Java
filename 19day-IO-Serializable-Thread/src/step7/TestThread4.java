package step7;

public class TestThread4 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 스레드 시작");
		Thread audioThread = new Thread(new VideoWorker(),"오디오 일꾼"); // 스레드이름도 넣음
		audioThread.start(); // 실행 가능 상태로 보낸다 
		Thread videoThread = new Thread(new AudioWorker(),"비디오 일꾼");
		videoThread.start();
		System.out.println(Thread.currentThread().getName()+" 스레드 종료"); 
		// 메인스레드 ,오디오 스레드 , 비디오 스레드 가 움직이는 3개의 스레드가 움직인다 
	}
}
