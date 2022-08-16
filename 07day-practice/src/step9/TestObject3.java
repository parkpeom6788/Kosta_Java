package step9;

public class TestObject3 {
	public static void main(String[] args) {
		Employee emp = new Employee(1,"아이유",1000);
		System.out.println(emp.getDetail());
		
		Engineer en = new Engineer(1,"강감찬",2000,"자바");
		System.out.println(en.getDetail());
		
		Manager ma = new Manager(2,"김지훈",3000,"영업부");
		System.out.println(ma.getDetail());
	}
}
