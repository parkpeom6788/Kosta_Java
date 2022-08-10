package step6;
// jdk 1.8 이상에서 지원 : default method , static method 만 구현부를 가질 수 있음 
interface Bank {
	void deposit(); // public abstract 메서드
	default void onlineDeposit() { // 새롭게 추가 -> 여러 하위 클래스에서 error 발생 
		// 어느 특정 클래스만 오버라이딩 할수있게 함  , 구현부가 있는 default 메서드를 1.8 이상에서 지원
	}
	public static void test() {} //구현부가 있는 static 메서드도 1.8 이상에서 지원 
}
class KaKaoBank implements Bank {
	// 부모의 접근제어자 보다 좁아지면 안된다.
	public void deposit() {
		System.out.println("카카오뱅크에 입금");
	}
	// 유지보수성 , 확장성에 좋음 
	@Override
	public void onlineDeposit() {
		System.out.println("카카오뱅크는 온라인 입금이 가능함");
		Bank.test(); // public static 접근 가능 
	}
}
class HanaBank implements Bank {
	@Override
	public void deposit() {
		System.out.println("하나 은행에 입금");
	}
}
public class TestInterface6 {	
	public static void main(String[] args) {
		Bank kakao = new KaKaoBank();
		kakao.deposit();
		kakao.onlineDeposit();
	}
}
