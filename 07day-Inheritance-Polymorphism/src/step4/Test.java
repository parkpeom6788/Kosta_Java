package step4;

class Animal {
	int age;
	Animal(int age) { // 생성자를 명시하면 기본생성자가 자동 삽입되지 않는다 Animal(){} x
	}
	public Animal() {} //  
}
/*
 생각해볼점 1) Person 생성자를 명시하지 않으면 error 나는 이유 
	 					2) Person 생성자를 명시하고 super(age) 를 꼭 명시해야 하는 이유 
*/
// 1)
class Person extends Animal {
	/*
	Person class 에서 별도로 생성자를 명시하지 않으면 아래와 같은 기본 생성자가 삽입됨
	 이 때 생성자의 첫라인에 super() 가 삽입되고 이 super() 는 부모의 기본 생성자를 호출함
	 But 현재 부모인 Animal class 의 기본 생성자는 존재하지 않는 상태이므로 compile error 
	*/
/*	
Person(){
		super();
	}
	// 2)
	public Person(String name,int age) {
		//super(age); // 매개변수에 맞는 인자값을 전달 하는 super(age)를 직접 명시해야 한다
	}
*/	
}
public class Test {
	public static void main(String[] args) {
		
	}
}
