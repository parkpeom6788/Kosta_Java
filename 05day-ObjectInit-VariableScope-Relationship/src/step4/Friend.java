package step4;

public class Friend {
	// 인스턴스변수
	private String name; 
	private int age;
	
	public Friend() {} // 기본 생성자
	public Friend(String name,int age) { // 매개변수 , 지역변수
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
