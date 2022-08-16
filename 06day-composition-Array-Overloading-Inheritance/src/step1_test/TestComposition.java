package step1_test;

public class TestComposition {
	
	public static void main(String[] args) {
		Car c = new Car("K5");
		c.setEngine(new Engine("하이브리드",2500));
		
		System.out.println(c.getEngine().getType());
		System.out.println(c.getEngine().getDisplacement());
		
		c.getEngine().setDisplacement(3000);
		System.out.println(c.getEngine().getType());
		System.out.println(c.getEngine().getDisplacement()); // 2500 -> 3000
		
	}
}
