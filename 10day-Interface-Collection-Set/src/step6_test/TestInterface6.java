package step6_test;

interface Bank {
	void deposit(); // public abstract 메서드
	
	// 상속해서 특정클래스에서 쓰고 싶다면 default
	default void onlineDeposit() {
		System.out.println("인터페이스의 deposit 호출 ");
	}
	
	public static void test() {
		System.out.println("하이1");
	}
}
class KaKaoBank implements Bank {
	// 부모의 접근제어자 보다 좁아지면 안된다.
	@Override
	public void deposit() {
		System.out.println("카카오뱅크에 입금");
	}
	@Override
	public void onlineDeposit() {
		Bank.super.onlineDeposit();
	}
	// static 메서드 오버라이딩 불가 
	// 정적메서드는 재정의가 아닌 새로 추가된 것
	// static 메서드는 컴파일 시 메모리 영역에 올라가고
	// 컴파일 시점에 선언된 타입의 메서드를 호출
	// 오버라이딩은 런타임 시 사용될 메서드 결정
	// static 은 클래스 단위 성격 , 오버라이딩은 객체 단위의 성격을 지님
	// 따라서 static 메서드는 오버라이딩 불가 
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
		
		Bank hanabank = new HanaBank();
		hanabank.deposit();
		hanabank.onlineDeposit();
	}
}
