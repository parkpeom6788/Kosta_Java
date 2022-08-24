package 쓰레드;

public class DemonThreadTest {
	public static void main(String[] args) {
		Thread deamon = new Thread(()->{
			while(true) {
				System.out.println("데몬스레드가 실행 중 입니다.");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		deamon.setDaemon(true); // 데몬스레드를 만든다
		deamon.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
