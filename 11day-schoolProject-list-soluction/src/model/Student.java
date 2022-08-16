package model;

public class Student extends Member{
	private String stuId;
	public Student() {}
	public Student(String tel, String name, String address, String stuId) {
		super(tel, name, address);
		this.stuId = stuId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		//부모 Member의 toString() 을 호출해서 tel name address 반환받은 후
		//자식의 독자적 멤버변수 stuId를 추가하면 된다.
		return "Student ["+super.toString() + " stuId : " + stuId +"]"; 
	}
}
