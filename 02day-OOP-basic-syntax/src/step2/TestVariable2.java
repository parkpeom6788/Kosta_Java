package step2;
public class TestVariable2 {
		// JVM이 가장 먼저 찾는 것이 main 메서드
	public static void main(String[] args) {
		// person 객체 -> 실체를 만듬
		// 코드 정리 :  ctrl + shift + f 
		Person p = new Person(); // Person 객체 생성
		p.name = "아이유";
		p.money = 200;

		System.out.println(p.name);
		System.out.println(p.money);
		
		// Person class(틀)로부터 객체를 하나 더 생성
		Person p2 = new Person();
		p2.name = "장기하";
		p2.money = 300;
		System.out.println(p2.name + " " + p2.money);
	}
}
