package step8_test;

public class Parent {
	private int money = 100; // private 클래스 내부에서만 접근 가능
//	protected int money = 100;
	public int getMoney() { 
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
