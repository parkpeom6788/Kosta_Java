package step6_test;

// association " 한번쓰고 버림 "
public class Person {
	
	private String name;
	
	public void tour() {
		RentCar rentcar = new RentCar("테슬라",20);
		System.out.println(rentcar.getMoney() +"원 비용을 지불하고");
		System.out.println(rentcar.getModel()+" 렌트 하여 여행하다");
	}
}
