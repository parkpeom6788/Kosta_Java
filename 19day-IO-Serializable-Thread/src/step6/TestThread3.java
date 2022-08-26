package step6;
/*
 * step5.TestThread2와 비교해본다 
 * 
 * 현 TestThread3은 여러개의 스레드(Multi Thread)를 실행하는 예제 
 * step5.TestThread2는 단일스레드 환경이므로 VideoWorker의 video 메서드가 반드시 모두 수행된 후에 
 * main 이 종료되었다 
 * 
 *  현재 코드는 멀티 스레딩 환경이므로 VideoWorker Thread를 main thread가 start 즉 실행가능상태로
 *  보낸 후 자신은 종료됨 , 이후 스케줄링을 받은 VideoWorker Thread가 run 즉 실행을 하고 종료된다
 * 
 *  new Thread(Class implements Runnable , 클래스이름)  -> start() -> Runnable(실행가능상태) -> jvm스케줄링에 의해서 -> Running 실행중상태 -> Run 메서드 실행
 */
// 스레드 생성방법 2가지 1) extends Thread 2) implements Runnable
// 2번 implements Runnable를 더 추천하는 이유는 자바는 단일 상속 이기 때문 
class VideoWorker implements Runnable {
	@Override
	public void run() { // JVM에 의해 스케줄링 되면 run 메서드가 실행 
		video();
	}
	public void video() {
		for(int i=0; i<10; i++) 
		System.out.println(Thread.currentThread().getName() + "스레드가 영상을 제공하다");
	}
}
public class TestThread3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" 스레드 시작");  // 메인스레드
		VideoWorker videoWorker = new VideoWorker(); // 영상일꾼만듬
		Thread thread = new Thread(videoWorker,"영상일꾼"); // 영상 스레드 생성자에 넣어줌 , 다형성 상위 인터페이스가 들어갈수있다.
		thread.start(); //스레드를 실행가능상태로 보낸다 -> JVM 스케줄링에 의해서 -> run 이 실행 
		System.out.println(Thread.currentThread().getName()+" 스레드 종료"); 
	}
}
