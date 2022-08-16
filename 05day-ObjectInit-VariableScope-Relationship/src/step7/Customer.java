package step7;
// Aggregation 관계
public class Customer {
	private String name;
	// aggregation : has a 관계 고객이 스마트폰을 소유하다
	// has a 관계 일때는 인스턴스 변수로 저장해 사용한다
	private SmartPhone smartPhone; // 주소값을 저장하게됨
										// Customer 이 없어지면 smartPhone도 없어짐
										// SmartPhone smartPhone = new SmartPhone("갤",100))
	public SmartPhone getSmartPhone() { // 변수타입을 반환타입으로 줌
		return smartPhone;
	}
	public void setSmartPhone(SmartPhone smartPhone) { // c.setSmartPhone(new SmartPhone("갤",100));
		this.smartPhone = smartPhone; // customer 에 인스턴스변수 smartPhone에 주소값이 저장
	}
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
