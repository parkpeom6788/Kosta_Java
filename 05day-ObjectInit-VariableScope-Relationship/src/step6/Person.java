package step6;

public class Person {
	
	public Person() {}
	public void tour() {
		// use a 관계이므로 지역변수로 렌트카를 생성해 사용
		RentCar rentCar = new RentCar("테슬라",20);
		System.out.println(rentCar.getPrice() +"원 비용을 지불하고");
		System.out.println(rentCar.getModel() +" 렌트하여 여행하다");
		
	}
}
