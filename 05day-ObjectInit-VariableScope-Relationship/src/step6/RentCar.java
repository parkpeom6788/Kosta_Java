package step6;

public class RentCar {
	private String model;
	private int price;
	
	// 생성자 생성
	public RentCar() {}
	public RentCar(String model, int price) {
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
