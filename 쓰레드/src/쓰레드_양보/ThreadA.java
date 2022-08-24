package 쓰레드_양보;

public class ThreadA extends Thread {
	
	public boolean stop = false; // 종료 플래그
	public boolean work = true; // 작업 진행 여부 플래그 
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA가 작업중 입니다.");
			} else {
				Thread.yield(); // work false시 , 다른 스레드에 양보 
			}
		}
		System.out.println("ThreadA가 종료되었습니다.");
	}
}
