package step5;

class VideoWorker {
	public void video() {
		for(int i=0; i<10; i++)
			System.out.println("영상을 제공하다");
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 스레드 시작");
		VideoWorker worker = new VideoWorker();
		worker.video(); // 단일 스레드 하나 순차적으로 혼자서 해야함
								 // 다른 손님 오면 기다려야함
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
	}
}
