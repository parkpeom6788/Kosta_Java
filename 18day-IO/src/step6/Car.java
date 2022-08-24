package step6;

import java.io.Serializable;
/*
 * Car 클래스로부터 생성된 객체가 직렬화 되기 위해서는 
 * implements Serializable 해야 한다
 * 만약 Serializable 인터페이스 계층 구조하에 있지 않으면
 * java.io.NotSerializableException 이 발생되고 외부로 전송되지 않는다
 */
public class Car implements Serializable {
	/*
	 * 객체 직렬화 고유 아이디 클래스단에 붙음
	 * 직접 생성할 것을 권장한다 
	 * 객체 직렬화 해서 밖으로 내보낸다 (붕어빵틀의 아이디)
	 * 객체 직렬화의 역직렬화시에 serialVersionUID 값이 동일해야 
	 * 문제없이 동작된다. => 만약 다를 경우에는 역직렬화 java.io.InvalidClassException 이 발생된다.
	 * 해결 : 붕어빵틀에 serialVersionUID를 만들어준다.
	 * 내부구조 price2 를 추가해도 문제없이 역직렬화가 가능하다.
	 */
	private static final long serialVersionUID = 7633804756410250690L;
	private String model;
	private int price;
//	private int price2; 
	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
}
