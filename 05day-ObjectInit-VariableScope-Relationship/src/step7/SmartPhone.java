package step7;

// SmartPhone 먼저 생성 
public class SmartPhone {
	private String model;
	private int price;
	
	public SmartPhone() {
	}
	// 
	public SmartPhone(String model, int price) {
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
}
