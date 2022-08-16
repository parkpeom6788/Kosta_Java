package model;
/*
 * abstract class 정의한 이유 : 부모 역할에 집중
 * 											자신 스스로 객체화 할 필요가 없을 때
 * 											학교 구성원 실제 객체가 되어야 하는 
 * 											요소는 학생,교사,직원 객체이다
 */
public abstract class Member {
	private String tel;
	private String name;
	private String address;
	
	public Member() {
	}
	public Member(String tel, String name, String address) {  // 유일한 값이 맨앞에 나오는게 좋다 primary key 
		super();// 부모클래스 Object의 생성자 호출해서 객체 생성하게 함
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
	// 자식클래스에서 재사용 할 수 있게 함
	// java.lang.Object class의 toString()을 오버라이드 하여 객체의 주소값 대신 
	// 실제 내용값으로 반환하게 한다 
	// Student , Teacher , Employee 자식 클래스의 toString() 오버라이드시에
	// 편리하게 재사용할 수 있도록 tel name address 를 반환하도록 재정의 했음
	@Override
	public String toString() {
		return "tel=" + tel + ", name=" + name + ", address=" + address + ",";
	}
}
