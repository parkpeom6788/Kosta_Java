package step4;
class WorkerThread extends Thread {
	@Override
	public void run() {
		// 스레드의 실행내용을 정의 : ex) 영상을 제공하다, 흠향을 들어주다 .. 
		for(int i=0; i<10; i++) 
			System.out.println(Thread.currentThread().getName()+" 스레드 실행"); // 현재 스레드 
	}
}
class Worker {
	public void go() {
		for(int i=0; i<10; i++) 
			System.out.println("Worker go()");
	}
}
public class TestThread1  {
	public static void main(String[] args) { // main 스레드 하나 
		// 첫번째 테스트 
		// Thread가 아닌 일반 클래스 객체 생성해서 go() 메서드를 호출해본다
		
		Worker worker = new Worker();
		worker.go();
		/**/ 
		// 첫번째 테스트는 여러번 실행해도 단일 스레드 환경이므로 go 메서드가 다 실행된 후에 메인이 종료된다.
		// 두번째 테스트 
		// Thread 를 생성해서 start 시켜서 첫번째 테스트와 비교해본다.
		WorkerThread thread = new WorkerThread();
		thread.setName("록키일꾼");
		thread.start(); // 현 스레드를 실행가능상태(Runnable)로 보내서 JVM이 실행하게 한다 main 스레드가 끝나도 실행됨
								// 스레드가 실행되면서 독립적으로 실행됨 
		System.out.println("main thread 종료");
		
	}
}
