package step5;
public class Manager extends Employee {
	private String Department;
	public Manager() {}
	public Manager(String name,int salary,String Department) {
		super(name,salary);
		this.Department = Department;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
