package step2;
import java.util.ArrayList;
// 집합(aggregation), 구성(composition)
class Animal {
	public void eat() {
		System.out.println("먹다");
	}
}
class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("");
	}
}
class Person extends Animal {
	
}
class Car {
	
}
public class TestGeneric {
	public static void main(String[] args) {
		// Generic : 타입의 안정성을 보장 , 객체 캐스팅 절차를 감소
		// Generic 을 사용하지 않은 경우의 예
		/*
		ArrayList animalList = new ArrayList();
		animalList.add(new Animal()); // 제너릭을 안걸면 Object 타입으로 다 받는다.
		animalList.add(28); // 동물 리스트에 다른 종류의 데이터가 저장될 수 있음 -> 타입의 안정성이 떨어짐
		// 동물 리스트의 첫번째 요소의 eat 메서드를 호출하고자 함
		Animal animal = (Animal)animalList.get(0);
		((Animal)animalList.get(0)).eat(); // 제너릭을 적용하지않아 리턴이 object 타입이므로 객체 캐스팅 절차가 필요함
		*/
		// Generic 적용 : Animal 타입 객체 및 하위 요소 객체를 저장 할 수 있다.
		ArrayList<Animal> animal = new ArrayList<Animal>();
		animal.add(new Animal());
//		animal.add(28); error Animal 계층 구조 하의 데이터가 아니므로 error 
		
		// Animal 계층구조 하의 요소가 아니면 등록될 수 없다 -> 타입의 안정성 보장 
		// 첫번째 요소의 eat 메서드를 호출
		animal.get(0).eat(); // 객체 캐스팅 절차 감소 
		animal.add(new Cat());

		animal.add(new Person()); // Animal 계층구조 하의 객체 이므로 가능
//		animal.add(new Car()); error Animal 계층구조 하의 객체 아니므로 등록 불가 
	}
}