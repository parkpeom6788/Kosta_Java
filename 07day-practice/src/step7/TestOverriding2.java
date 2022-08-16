package step7;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e;
		e = new Employee(1,"아이유",400);
		// empNo : 1 name : 아이유 salary : 400
		System.out.println(e.getDetails());
		Manager m = new Manager(2,"손석구",500,"영업");
		// empNo : 2 name : 손석구 salary : 500  department : 영업
		System.out.println(m.getDetails());
		
		Engineer en = new Engineer(3,"강하늘",600,"자바");
		System.out.println(en.getDetails());
		// empno : 3 name : 강하늘 salary: 600 skill : 자바 
		// 신입은 스킬이 없으면
//		System.out.println("----신입----");
//		Engineer en2 = new Engineer(4,"강지원",200);
//		System.out.println(en2.getDetails());		
	}
}
