package step9;

public class Manager  extends Employee {
	private String department;
	public Manager() {
	}
	public Manager(int empNo,String name,int salary,String department) {
		super(empNo,name,salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDetail() {
		return super.getDetail() + " department : " + department;
	}
}
