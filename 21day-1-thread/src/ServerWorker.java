
// JVM 입장은 Runnable 을 보게 되며 run 메서드 호출 
// JVM -> Runnable run()만 호출하면 S-OOT , MAKEW-T 등 호출 
public class ServerWorker implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		for(int i=0; i<5; i++) {
			System.out.println(threadName + " threqad 일꾼이 실행 " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
