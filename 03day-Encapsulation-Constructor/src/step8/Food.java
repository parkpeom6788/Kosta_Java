package step8;

public class Food {
	private String name,maker;
	private int price;
	
	// 생성자명은 클래스명과 동일해야 한다.
	public Food (String name,String maker,int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
	// 생성자 인스턴스값 복사 
	public Food(Food f) {
		this(f.name,f.maker,f.price);
	}
	
	public String getName() {
		return name;
	}
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}
}
