package step2;

/*
 * 멀티 스레드 예
 * 채팅 서버의 입장에서 스레드를 구성해본다
 * 첫번째 고객의 접수처 역할 , 고객이 접수하면 담당 직원을 연결 (담당할 스레드를 생성해 start )
 * 				하는 스레드 => main thread 가 담당하면 됨 
 * 두번째 실제 고객(클라이언트)에게 서비스하는 스레드 
 * 
 * 클래스 구성은 위의 두 종류를 정의하면 된다 
 * 두번째 실제 고객에게 서비스는 스레드는 접속한 고객 당 하나씩 생성되어야 한다 -> 접속 종료시 run 메서드 종료
 */
public class TestThread6 { // 접수해서 스레드를 만들어주는 클래스
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName(); // main
		System.out.println(threadName + "스레드 시작"); // 메인스레드가 서버의 접수처 대표전화 역할을 한다 
		ServerWorker sw = new ServerWorker();
		// 고객이 7명이 오면 7개의 스레드를 만들어줘야함 -> 나중 접속시 accept 이벤트 
		for(int i=1; i <= 3; i++) {
			Thread thread= new Thread(sw,i+"번 일꾼");
			thread.start();// 같은일을 하는 직원들을 만들어 실행을 시켜줌
		}
		System.out.println(threadName+"스레드 종료");
	}
}
