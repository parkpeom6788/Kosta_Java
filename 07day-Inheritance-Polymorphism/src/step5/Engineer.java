package step5;

public class Engineer extends Employee {
	private String Skill;
	public Engineer(String name,int salary,String skill) {
		super(name,salary);
		this.Skill = skill;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
}
