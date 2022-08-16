package step1;
// static : 별도의 객체생성없이 메타스페이스에 있는 멤버를 참조함 
// void : 반환이 없음
// main : 메서드명
// String[] 배열 
public class TestStatic3 {
	String name; // object member variable , instance variable 
	static String name2; // static variable , class member variable 
	
	// method
	public  void test1() {
		System.out.println("object member method test1");
	}	
	// static method
	public static void test2() {
		System.out.println("class member method test2");
	}
	public static void main(String[] args) { 		
		// System.out.println(name); // main이 static 이기때문에 접근할 수 없다 그러므로 객체생성 해야지 사용할 수 없다
		// 동일한 클래스 내부에 메인 메서드 안에서 인스턴스 변수 name에 접근해 사용 
		// 메인 메서드는 static method , 별도의 객체 생성없이 meta space 메모리 영역에 적재
		// 인스턴스 변수 name은 반드시 객체 생성하여 heap 영역에 메모리가 적재될때 
		// 사용할 수 있는 속성이 있으므로 static 메서드인 main 메서드에서 직접 접근은 불가하다 
		// 접근하기 위해서는 같은 클래스 내부 요소라도 객체 생성 절차를 거치면 됨 
		System.out.println(name2); 
		// non-static은  객체 생성해서 접근한다 
		TestStatic3 test = new TestStatic3();
		System.out.println(test.name);
		// meta space 영역에 있는 메모리는 main메소드가 끝나고 프로그램이 종료된 후에 사라지나요 
		// static 끼리는 직접 접근 가능 
		System.out.println(name2); // 동일한 클래스 내부이므로 별도의 클래스 명시할 필요없음 
		// 마찬가지로 test1() 메서드 또한 객체 생성이 필요 
		// test1(); // error 
		test.test1(); // 객체 생성을 통해 접근이 가능 
		// static 끼리는 바로 접근 가능
		test2();
	}
}
