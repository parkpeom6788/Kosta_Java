package 스레드간협업;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA 의 methodA() 작업 실행");
		notify();
	
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
