package step5;
public class TestSuper5 {
	public static void main(String[] args) {
		Employee e = new Employee("아이유",400);
		System.out.println(e.getName() + " " + e.getSalary());
		Manager m = new Manager("손석구",500,"연구개발");
		System.out.println(m.getName() + " " + m.getSalary() + " "+m.getDepartment());
		Engineer en = new Engineer("강하늘",700,"Java");
		System.out.println(en.getName() + " " + en.getSalary() + " " + en.getSkill());
	}
}