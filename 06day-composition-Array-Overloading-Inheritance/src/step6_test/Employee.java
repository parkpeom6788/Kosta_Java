package step6_test;

public class Employee {
	private String name;
	private int salary;
	private String department;	
	// 기본 생성자 매개변수가없다. 컴파일러가 자동으로 생성
	public Employee() {} 
	// 생성자 오버로딩 ( 다양한 옵션으로 객체를 만듬 )
	public Employee(String name) {
		this.name = name;
	}
	// 생성자 오버로딩 
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name,int salary,String department) {
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
