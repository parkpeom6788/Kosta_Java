package step1;
public class ServerWorker implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		for(int i=0; i<5; i++) {
			System.out.println(threadName + " thread일꾼이 실행" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
