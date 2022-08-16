package step7_test;

// 소유 할 물건을 먼저 생성한다.
public class SmartPhone {
	
	private String name;
	private String model;
	private int price;
	
	public SmartPhone(String name, String model,int price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
