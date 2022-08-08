package step1;
class StaticExam1 {
	int bonus; // instance variable ( Object member variable )
	static int money; // static variable ( class member variable ) - 별도의 클래스생성없이 클래스명으로 접근 
	// method
	public void test1() {
		System.out.println("Object member method");
	}
	// static method 
	public static void test2() {
		System.out.println("class member method == static method");
	}
}
public class TestStatic1 {
	public static void main(String[] args) {
		// static은 별도의 객체 생성없이 클래스.static 멤버로 접근 가능
		System.out.println(StaticExam1.money);
		StaticExam1.test2(); // static method 이므로 클래스명.메서드로 호출가능  
		// 아래는 컴파일에러 , non - static method 이므로 반드시 객체 생성이 필요 
		//	 StaticExam1.test1(); 
		// 아래는 컴파일 에러 , non-static 이기 때문에 객체를 생성해야 한다 
		StaticExam1 e = new StaticExam1(); 
		System.out.println(e.bonus); // 인스턴스 변수는 객체를 만들어서 접근한다 
		//	System.out.println(StaticExam1.bonus);
		e.test1();
	}
}
