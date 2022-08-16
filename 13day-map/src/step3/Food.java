package step3;

public class Food {
	private long id;
	private String name;
	private String maker;
	private int price;
	
	public Food() {}
	public Food(long id, String name, String maker, int price) {
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Food) {
			Food food2 = (Food)obj;
			if(this.id == food2.id) {
			}
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
}
