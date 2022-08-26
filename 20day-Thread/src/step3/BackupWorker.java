package step3;
public class BackupWorker implements Runnable {
	@Override
	public void run() {
		// word()가 실행될동안 영원히 백업이 되야함
		while(true) {
			try {
				// 3초후에 백업처리를 한다.
				Thread.sleep(3000);
				backup();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void backup() throws InterruptedException {
		System.out.println("백업스레드가 워드문서를 백업처리한다");
	}
}
