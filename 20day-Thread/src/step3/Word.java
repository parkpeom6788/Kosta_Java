package step3;

public class Word implements Runnable {

	@Override
	public void run() {
		System.out.println("**워드문서스레드작업시작**");
		// 워드 실행시 backupWorker 를 실행시킴 
		BackupWorker backupWorker  = new BackupWorker();
		Thread  backupThread = new Thread(backupWorker);
		//backup 작업을 담당하는 스레드를 Daemon Thread로 만든다
		//자신을 생성한 스레드가 종료되면 함께 종료되는 스레드가 Daemon Thread 임
		backupThread.setDaemon(true);
		backupThread.start();
		try {
			word();
			// 워드문서가 종료되기전에 반드시 백업을 하도록 메서드를 직접 호출 
			backupWorker.backup();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("**워드문서스레드작업종료**");
	}
	public void word() throws InterruptedException {
		for(int i=0; i<20; i++) {
			System.out.println("워드문서작업" + i);
			Thread.sleep(1000);
		}
	}
}
