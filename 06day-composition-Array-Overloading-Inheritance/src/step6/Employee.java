package step6;
public class Employee {
	private String name;
	private int salary;
	private String department;
	public Employee() {} // 기본생성자 매개변수가없다 . 기본적으로 컴파일러가 들어가게 되어있다
	
	// 생성자 오버로딩 ( 다양한 옵션으로 객체를 만든다 ) 
	public Employee(String name) {
		this.name = name;
	}
	// 생성자 오버로딩 
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
