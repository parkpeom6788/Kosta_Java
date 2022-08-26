package step6;

class VideoWorker implements Runnable {

	@Override
	public void run() {
		video();
	}
	public void video() {
		for(int i=0; i<10; i++) 
			System.out.println(Thread.currentThread().getName() +" 쓰레드가 영상을 제공하다");
	}
}


public class TestThread3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 스레드 시작");
		VideoWorker videoWorker = new VideoWorker();
		Thread th = new Thread(videoWorker,"영상일꾼");
		th.start();
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}
}
