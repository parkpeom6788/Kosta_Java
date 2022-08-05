package step8;

public class Employee {
	private int empNo;
	private String empName;
	private int salary;
	public Employee() {
	}
	public Employee(int empNo, String empName, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	public int getSalary() { 
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "empNo : " + empNo + "empName : " + empName + "salary : " + salary;
	}
}
