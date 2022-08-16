package model.vo; // vo : Value Object	

// abstract class 로 선언해서 직접 객체화 되지 못하게 하고
// 자식 클래스에게 멤버(인스턴스변수,메서드)를 물러주고,
// 계층구조형성을 통해 다형성 적용환경을 제공한다
public abstract class Member { 
	private String tel;
	private String name;
	private String address;
	public Member() {
	}
	public Member(String tel, String name, String address) {
		super();
		this.tel = tel;
		this.name = name;
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return " tel=" + tel + ", name=" + name + ", address=" + address + ",";
	}
}
