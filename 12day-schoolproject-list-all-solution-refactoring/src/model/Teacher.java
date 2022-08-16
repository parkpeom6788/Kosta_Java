package model;
public class Teacher extends Member {
	// new Student("0101231234", "임상현", "용인", "17"));
	private String subject;
	
	public Teacher() {
	}
	public Teacher(String tel,String name,String address, String subject) {
		super(tel,name,address);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher : " + super.toString() + "subject : " + subject;
	}
}
