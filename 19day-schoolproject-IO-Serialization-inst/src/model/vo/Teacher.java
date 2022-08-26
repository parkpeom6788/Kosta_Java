package model.vo;

public class Teacher extends Member{
	private static final long serialVersionUID = -552780338100499178L;
	private String subject;

	public Teacher(String tel, String name, String address, String subject) {
		super(tel, name, address);
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
		return "Teacher ["+super.toString()+"subject=" + subject + "]";
	}
	
}
