package 쓰레드;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				System.out.println("interrupted 발생");
				e.printStackTrace();
			}
			System.out.println("자원정리");
			System.out.println("실행종료");
		}
	}

