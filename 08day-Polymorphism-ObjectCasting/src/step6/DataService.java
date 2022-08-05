package step6;

import step1.Animal;
import step1.Person;

public class DataService {
	public void register(Animal a) {
		// instanceof 연산자 테스트 : 객체 타입을 비교한다
		System.out.println("사람여부:"+(a instanceof Person)); // 하나 false 
		// instanceof 연산자는 is a 관계일때 true 
		System.out.println("동물여부:"+(a instanceof Animal)); // 둘다 동물 true 
		
	}
}
