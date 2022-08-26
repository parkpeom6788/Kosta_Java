package step6;

import java.io.Serializable;

/* Car 클래스로부터 생성된 객체가 직렬화 되기 위해서는
 * implements Serializable 해야 한다
 * 만약 Serializable 인터페이스 계층 구조하에 있지 않으면
 * java.io.NotSerializableException 이 발생되고 외부로 전송되지 않는다
 */
public class Car implements Serializable {
	private static final long serialVersionUID = -2291367246278904326L;
    private String model;
    private int price;
    public Car(String model,int price) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
}
