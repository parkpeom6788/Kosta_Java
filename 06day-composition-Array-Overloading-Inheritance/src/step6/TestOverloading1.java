package step6;
// 학습을 위해 하나의 파일에 클래스를 여러개 명시 
// 메서드 오버로딩( method Overloading) 의 예
class Service {
	public void test() {
		System.out.println("test");
	}
	public void test(int count) { // 동일한 메서드명으로 다양한 매개변수 정의 - > 오버로딩 
		System.out.println("test " + count);
	}
	public void test(String name) { // 변수명은 상관없다 타입 또는 개수가 달라야 한다.
		System.out.println("test " + name);
	}
	public void test(String name,int count) { // 변수명은 상관없다 매개변수의 타입 또는 개수가 달라야 한다.
		System.out.println("test " + name + " " + count);
	}
	
	public void test(String...str) {
		for(String s : str) {
			System.out.println(s + " ");
		}
	}
}
public class TestOverloading1 {
	public static void main(String[] args) {
		Service s = new Service();
		s.test();
		s.test(3);
		s.test("아이유");
		s.test("커피",5);
	}
}
