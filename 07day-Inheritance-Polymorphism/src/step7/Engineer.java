package step7;

public class Engineer extends Employee {
	private String skill;
	public Engineer() {}
	
	public Engineer(int empNo,String name,int salary,String skill) {
		super(empNo,name,salary);
		this.skill = skill;
	}
	// 신입은 스킬이 없으면 ?
	public Engineer(int empNo, String name, int salary) {
		super(empNo,name,salary);
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@ Override // 어노테이션(에너테이션) : 의미있는 주석 -> 오버라이드 문법 체크 
	public String getDetails() {
		if(skill == null) {
			return super.getDetails();
		}
		return super.getDetails() + " skill : " + skill;
	}
}
