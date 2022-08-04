package step7;

public class Employee {
	private int empNo;
	private String name;
	private int salary;
	public Employee() {
	}
	public Employee(int empNo, String name, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	public String getDetails() {
		return "empNo : " + empNo + " name : " + name + " salary : " + salary;
	}
}
