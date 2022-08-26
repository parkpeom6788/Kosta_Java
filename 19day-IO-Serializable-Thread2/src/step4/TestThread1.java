package step4;

class WorkerThread extends Thread {
	@Override
	public void run() {
		// 스레드의 실행 내용 정의 
		for(int i=0; i<10; i++) 
			// Thread currentThread static이다.
			System.out.println(Thread.currentThread().getName() + " 쓰레드 실행 ");
	}
}
class Worker {
	public void go() {
		for(int i=0; i<10; i++)
			System.out.println("Worker go()");
	}
}
public class TestThread1 {
	public static void main(String[] args) { // main 스레드 하나
		Worker worker = new Worker();
		worker.go();
		WorkerThread thread = new WorkerThread();
		thread.setName("록키일꾼");
		thread.start(); 
		System.out.println("main thread 종료");
	}	
}
