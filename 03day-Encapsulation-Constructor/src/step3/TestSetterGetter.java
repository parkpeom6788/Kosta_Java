package step3;

public class TestSetterGetter {
	public static void main(String[] args) {
		Car c =  new Car();
		c.setModel("소나타");
		System.out.println(c.getModel());//소나타
		c.setPrice(200);
		System.out.println(c.getPrice());// 200
	}
}
