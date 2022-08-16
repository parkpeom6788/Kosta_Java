package step4;
public class Item {
	private String name;
	private String maker;
	private int price;
	public Item(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
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
}
