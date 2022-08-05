package step8;
// DAO
public class HumanResourceService {
	public HumanResourceService() {}
	/*
	 * Employee 부모 타입으로 매개변수를 선언하면
	 * Employee 객체 및 자식 Manager객체 모두 처리 가능 
	 */
	public void printInfo(Employee emp) { // println 내부에서 toString() 호출해줌
		System.out.println(emp.toString());
	}
	public void printAnnualSalary(Employee emp) {
			int annualSalary = emp.getSalary() * 12;
			if(emp instanceof Engineer) {
				// 매개변수가 부모 Employee 타입이므로 Engineer 의 독자적
				// 메서드인 getBonus() 를 호출하기 위해 Object Down Casting 한다 
				int bonus = ((Engineer)emp).getBonus();
				annualSalary += bonus * 12;
			}
			System.out.println("연봉 : " + annualSalary);		
	}
}
