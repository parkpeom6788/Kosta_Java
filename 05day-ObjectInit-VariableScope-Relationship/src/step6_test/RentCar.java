package step6_test;

public class RentCar {
	private String model;
	private int money;
	public RentCar(String model, int money) {
		super();
		this.model = model;
		this.money = money;
	}
	public RentCar() {
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
