package step5;

public class Manager extends Employee {
	private String department;
	// Manager 생성자를 명시하고 첫라인에 super(인자값) 을
	// 명시하면 됨
	public Manager(String name,int salary,String department) {
		super(name,salary); // 부모 생성자 매개변수에 알맞게 super()를 호출 
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}