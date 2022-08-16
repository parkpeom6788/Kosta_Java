package step2_test;

// JVM이 가장 먼저 public class의 main메소드를 찾는다.
public class TestVariable2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "아이유";
		p.money = 200;
		
		System.out.println(p.name);
		System.out.println(p.money);
		
		//Person class(틀)로부터 객체를 하나 더 생성한다.
		Person p2 = new Person();
		p2.name = "장기하";
		p2.money = 300;
		System.out.println(p2.name + " " + p2.money);
	}
}
