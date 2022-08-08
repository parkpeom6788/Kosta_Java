package step1;
/*
	static 과 non - static 과의 접근 특성 
 */
class StaticExam2 {
	int money1; // non-static , instance variable
	static int money2; // static variable  - 클래스 로딩할때 미리 메모리에 적재됨
	public void test1() {
		// non - static method 내부에서 접근 여부를 테스트
		System.out.println(money1); // 같은 non static 이므로 접근 가능
		System.out.println(money2);// static 은 미리 메모리에 적재되므로 접근 가능
	}
	public static void test2() {
		// static method 내부에서 접근 여부를 테스트 
		System.out.println(money2); // 같은 static 끼리 이므로 접근 가능 
		// System.out.println(money1);  // static은 이미 올라가므로 인스턴스(힙메모리영역)은 사용못함 -> 객체 생성을 해서 접근해야 한다 
		// static 에서 non-static 인 instance variable 로 직접 접근은 불가 
		// 이유는 static 은 객체 생성 없이 미리 클래스 로딩 시에 meta space 메모리영역에 적재가 되지만 
		// 아래 instance variable 인 money1 은 객체 생성 할 때만 heap 메모리 영역에 적재 되므로 
		// 직접 접근은 불가능 하고 접근을 위해서는 객체 생성 작업이 선행 되어야 한다 
		// System.out.println(money1);
		// 아래와 같이 객체 생성해서 접근하면 된다
		StaticExam2 exam = new StaticExam2();
		System.out.println(exam.money1);
	}
}
public class TestStatic2 {
	public static void main(String[] args) {
		StaticExam2 exam = new StaticExam2();
		exam.test1(); 
		StaticExam2.test2(); // test2 메서드가 static 이므로 클래스로 접근해 사용 가능 
	}
}






