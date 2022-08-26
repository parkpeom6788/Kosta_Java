package step1;

public class InputWorker implements Runnable {	// 인터페이스는 다양한 계층구조 다형성을 지원 
																				// public abstract void run(); 구현 강제
	@Override // 어노테이션 : 컴파일시 해석해주는 의미있는 주석
	public void run() {
		try {
			receiveMessage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}  
	// 별도로 메서드를 분해해주는게 좋다
	public void receiveMessage() throws InterruptedException { // 수신
		String threadName = Thread.currentThread().getName();
		for(int i=0; i<10; i++) {
			System.out.println(threadName+"스레드가 친구들의 메세지를 입력받는다");
			Thread.sleep(1000); 
		}
	}
}
