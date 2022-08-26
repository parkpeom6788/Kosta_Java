package step1;

public class OutputWorker implements Runnable {
	
	@Override
	public void run() {
		try {
			sendMessage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void sendMessage() throws InterruptedException { // 발신
		String threadName = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
				System.out.println(threadName+"스레드가 친구들에게 메세지를 출력한다");
				Thread.sleep(1000);
		}
	}
}
