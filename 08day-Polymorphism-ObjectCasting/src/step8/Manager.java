package step8;
public class Manager extends Employee {
		private String department;
		
		public Manager(int empNo,String empName,int salary,String department) {
			super(empNo,empName,salary);
			this.department = department;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return  super.toString() + " department : " + department;
		}
}
