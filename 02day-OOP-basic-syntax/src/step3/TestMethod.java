package step3;

public class TestMethod {
	public static void main(String[] args) {
		//객체 생성
		Account a1 = new Account();
		// name을 할당
		a1.name = "김길동";
		// deposit 메서드를 호출해 실행
		a1.deposit(100);
		Account a2 = new Account();
		a2.name = "장기하";
		a2.deposit(200);
		
		System.out.println("*****");
		// 호출하여 실행한 출금메서드가 반환한
		// money를 m 변수에 할당받는다
		int m = a1.withdraw(10);
		System.out.println("client 출금:" + m);
		
	}
}
