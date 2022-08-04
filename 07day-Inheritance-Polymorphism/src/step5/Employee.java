package step5;

public class Employee {
	private String name;
	private int salary;
	public Employee() {}
	public Employee(String name, int salary) {
		super(); // java.lang.Object 생성자 호출 -> 이후 공부예정
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
