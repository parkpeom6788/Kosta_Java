package step5.test2;

// VO 클래스 getter/setter
public class Product {
	private int number;
	private String name;
	private String maker;
	private int price;
	
	public Product() {}
	public Product(int number, String name, String maker, int price) {
		this.number = number;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
}
