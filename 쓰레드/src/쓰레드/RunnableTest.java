package 쓰레드;

public class RunnableTest {
	
	public static void main(String[] args) {
		
		Runnable task = new Runnable() { // 꼭 Runnable 을 구현한 객체를 파일로 만들지 않고 익명-구현-객체만들기
			public void run() {
				int sum = 0;
				for(int index = 0; index < 10; index++) {
					sum += index;
					System.out.println(sum);
				}
				System.out.println(Thread.currentThread() + "최종 합 : " + sum);
			}
		};
		Thread subThread1 = new Thread(task);
		Thread subThread2 = new Thread(task);
		
		subThread1.start();
		subThread2.start();
		
	}
}
