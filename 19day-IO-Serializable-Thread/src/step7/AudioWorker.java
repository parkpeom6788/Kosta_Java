package step7;

public class AudioWorker implements Runnable {
	@Override
	public void run() {
		try {
			audio();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void audio() throws InterruptedException {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+"스레드가 음향을 재생하다");
			// Running -> Block(잠시쉬었다감) Thread.sleep 일시적으로 잠깐 실행을 멈췄다가 재개 -> Runnable
			Thread.sleep(1000); // 2초간 스레드가 실행을 중지한 후 다시 재개 
		}
	}
}
