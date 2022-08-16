package Test;

public class AirPlane extends Vehicle implements Flyer {
	@Override
	public void fly() {
		System.out.println("비행기가 날다");
	}
}
