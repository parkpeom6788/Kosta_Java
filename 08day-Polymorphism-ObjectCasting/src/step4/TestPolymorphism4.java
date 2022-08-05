package step4;

import java.util.ArrayList;

import step1.Person;
import step1.Rabbit;

public class TestPolymorphism4 {
	public static void main(String[] args) {
		DataService service = new DataService();
		service.add(new Person());
		service.add(new Rabbit());
		
		ArrayList<Object> list = new ArrayList();
//		list.add(Object e); // add(Object e) 다형성을 적용했구나
		
	}
}
