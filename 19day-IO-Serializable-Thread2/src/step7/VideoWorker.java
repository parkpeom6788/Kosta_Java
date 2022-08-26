package step7;

public class VideoWorker implements Runnable {

	@Override
	public void run() { // run 에서 try-catch 한다 
		try {
			video();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void video() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+" 스레드가 영상 시작");
			Thread.sleep(1000);
		}
	}
}

class AudioWorker implements Runnable {

	@Override
	public void run() {
		try {
			audio();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void audio() throws InterruptedException {
		for(int i=0; i<10; i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + "스레드가 음향 ");
		}
	}
}