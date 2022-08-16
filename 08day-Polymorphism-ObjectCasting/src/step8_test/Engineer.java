package step8_test;

public class Engineer extends Employee{
	private String skill;
	private int bonus;
	public Engineer() {
	}
	public Engineer(int empNo,String name,int salary,String skill,int bonus) {
		super(empNo,name,salary);
		this.skill = skill;
		this.bonus = bonus;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString() + " skill :" + skill + " bonus : " + bonus;
	}
}
