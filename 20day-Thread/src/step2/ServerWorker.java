package step2;

// 접수해서 스레드를 실행해주는 클래스 
public class ServerWorker implements Runnable {

		public void run() {
			try {
				chattingService();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*
			main스레드 종료
			1번 일꾼 스레드가 고객에게 채팅서비스를 하다0
			3번 일꾼 스레드가 고객에게 채팅서비스를 하다0
			2번 일꾼 스레드가 고객에게 채팅서비스를 하다0
			3번 일꾼 스레드가 고객에게 채팅서비스를 하다1
			1번 일꾼 스레드가 고객에게 채팅서비스를 하다1
			2번 일꾼 스레드가 고객에게 채팅서비스를 하다1
			
			위는 현재 클래스를 멀티 스레딩한 결과 중 일부이다 
			각 일꾼들이 자신의 지역 변수를 가지고 1씩 증가 되는 것을 확인할 수 있다 
			
			 지역변수를 Local variable 을 저장하는 stack 메모리 영역은 
			 스레드 별로 생성되어 독립적으로 관리된다 
			 
		*/
		public void chattingService() throws InterruptedException {
			String threadName = Thread.currentThread().getName();
			for(int i=0; i<10; i++) {
				// 스택 메모리 별로 쓰레드가 생성돼 자신의 지역변수 값을 가지고 있어서 공유하지 않는다 
				System.out.println(threadName+" 스레드가 고객에게 채팅서비스를 하다" + i);
				Thread.sleep(1000);
			}
		}
}
