package step4;

import step1.Animal;
public class DataService {
	
	// 부모 타입의 매개변수를 명시해 다양한 자식 객체들을 처리
	public void add(Animal a) {
		a.eat(); // 오버라이드된 자식이 메서드가 실행
		// 각 객체에서 오버라이딩이 됨으로써 사용하는 측에서는 
		// 부모인 Animal eat() 이라는 하나의 소통방식으로
		// 다양한 자식 객체 Person, Rabbit 등 각자의 방식으로 
		// 동작하게 할 수 있다 ( 잡식 , 채식하다 ... )
	}
}
