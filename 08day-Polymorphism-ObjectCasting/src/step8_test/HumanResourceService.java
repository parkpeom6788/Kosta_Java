package step8_test;
// DAO
public class HumanResourceService {
	public HumanResourceService() {}
	public void printInfo(Employee emp) {
		System.out.println(emp.toString());
	}
	public void printAnnualSalary(Employee emp) {
		int totalprice = emp.getSalary() * 12;
			if(emp instanceof Engineer) {
				totalprice += ((Engineer) emp).getBonus() * 12;
			}
		System.out.println(totalprice);
	}
}
