// 간단 리뷰
/*
 * thread : process 내의 세부적 실행단위
 * process : 현재 실행 중인 프로그램
 * multi = threading : 다수의 스레드가 동시에 동작 
 */
public class TestThread8 {
	public static void main(String[] args) {
		// main method 실행하는 main thread
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " 스레드 일꾼 시작");
		ServerWorker worker = new ServerWorker();
	// 멀티스레드 태스킹 동시에 여러가지 일을 함 
		Thread thread = new Thread(worker,"손석구"); // Thread가 ServerWorker를 가짐
		thread.start();
		
		Thread thread2 = new Thread(worker,"정해인"); 
		thread2.start();
		System.out.println(threadName + " 스레드 일꾼 종료");
		
		/*
		new Thread(new Runnable() {
			@Override
			public void run() {
			}
		}).start();
		*/
	}
}
