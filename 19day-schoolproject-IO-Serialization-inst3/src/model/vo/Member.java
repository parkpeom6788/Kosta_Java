package model.vo;

import java.io.Serializable;

public abstract class Member implements Serializable{
	private static final long serialVersionUID = -6825955563001256929L;
	private String tel;
	private String name;
	private String address;
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
	// java.lang.Object 의 toString메서드를 오버라이드하여 주소값 대신 객체 실제 내용이
	// 반환되도록 한다 , 자식 클래스에서 재사용(super.toString())하도록 아래와 같이
	// 코드를 정리한다 
	@Override
	public String toString() {
		return "tel=" + tel + ", name=" + name + ", address=" + address + ", ";
	}
	
}
