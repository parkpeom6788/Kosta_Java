package step1;
/**
  	멀티 스레드의 예 1:
  	채팅 클라이언트 상에서 멀티 스레드 구성을 해본다
  	친구들의 메세지를 입력받는 스레드 
  	친구들에게 메세지를 출력하는 스레드
  	이 두 스레드가 동시에 실행 즉 멀티 스레딩 되어야 한다 
  	-> 실제 IO, Thread , Network 의 Socket을 이용해 구현은 다음주에 할 예정 
 */
public class TestThread5 {
	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(currentThreadName+" 스레드 시작");
		InputWorker iw = new InputWorker(); // 쓰레드는 일꾼이다라고 생각
		OutputWorker ow = new OutputWorker();
	
		Thread inputThread = new Thread(iw,"채팅입력");
		inputThread.start(); // 스레드를 jvm에게 실행가능상태 Runnable 로 보낸다	
										// JVM 이 스케줄링 하면 Run이 실행한다 
										// 실제 실행 내용은 run() 에 정의
		System.out.println(currentThreadName+" 스레드 종료");
		
		
		Thread outputThread = new Thread(ow,"채팅출력");
		outputThread.start();
	}
}
