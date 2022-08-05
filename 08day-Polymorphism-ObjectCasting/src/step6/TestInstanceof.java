package step6;

import step1.Person;
import step1.Rabbit;

public class TestInstanceof {
	public static void main(String[] args) {
		
		DataService service = new DataService();
		service.register(new Person()); // true
		service.register(new Rabbit()); // false 
	}
}
