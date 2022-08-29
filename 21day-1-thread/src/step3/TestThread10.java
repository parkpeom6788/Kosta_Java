package step3;
/*
 * 동기화 처리 synchronized 의 필요성을 확인하는 예제
 * 멀티 스레딩시
 * 여러 스레드가 하나의 자원을 공유할 때
 * 특정 업무 처리 영역에서는 단일 스레드 환경으로
 * 만들어 실행시켜야 한다 
 */
public class TestThread10 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread thread1 = new Thread(toilet,"윤석열");
		Thread thread2 = new Thread(toilet,"이명박");
		thread1.start();
		thread2.start();
		
		
	}
}
