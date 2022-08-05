package step8;
class Animal {}
class Person extends Animal{}
class Monkey extends Animal {}
class Car{}
// 다형성 적용 배열 
public class TestPolymorphism8 {
	public static void main(String[] args) {
		Animal[] a = new Animal[3]; // Animal type 배열 생성
		a[0] = new Animal();
		a[1] = new Person(); // 부모 타입의 배열에 자식 객체 요소로 등록이 가능
		a[2]=new Monkey(); // 자식 객체이므로 가능
//		a[3]=new Car();  error , Animal 계층 구조 하에 있지 않으므로 Car는 등록불가 
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
