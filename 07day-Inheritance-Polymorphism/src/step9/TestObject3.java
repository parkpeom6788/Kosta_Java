package step9;
/*
 * 자바의 최상위 클래스인 Object의 toString() 메서드를 오버라이드 하는 예제
 */
public class TestObject3 {
	public static void main(String[] args) {
		Employee e;
		e = new Employee(1,"아이유",400);
		// empNo : 1 name : 아이유 salary : 400
		System.out.println(e);
		Manager m = new Manager(2,"손석구",500,"영업");
		// empNo : 2 name : 손석구 salary : 500  department : 영업
		System.out.println(m);
		Engineer en = new Engineer(3,"강하늘",600,"자바");
		System.out.println(en);
		// empno : 3 name : 강하늘 salary: 600 skill : 자바 
		
		// 다형성
		Employee e1 = new Manager();
		e1.showInfo(new Manager());
		e1.showInfo(new Engineer());
	}
}
