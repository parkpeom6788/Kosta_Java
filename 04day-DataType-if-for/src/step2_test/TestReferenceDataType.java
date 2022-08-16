package step2_test;

public class TestReferenceDataType {
	
	public static void main(String[] args) {
		int i = 22;
		/*
		 * Person : Reference Data Type 참조형 
		 * p : 지역함수 이자 참조변수(객체를 참조하는)
		 * p는 new Person()으로 생성한 객체의 주소값을 참조한다
		 */
		Person p = new Person("아이유");
		System.out.println(p.getName() + " " + p.getAge());
		Person p2 = new Person(p);
		System.out.println(p2.getName() + " " + p2.getAge());
	}
}
