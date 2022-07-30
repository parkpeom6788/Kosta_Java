package step8_test;

public class Food {
	
	private String name,maker;
	private int price;
	
	// 생성자 명과 클래스명이 동일해야 한다.
	
	public Food() {
		
	}
	public Food(String name,String maker,int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	
	public String getMaker() {
		return this.maker;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
