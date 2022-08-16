package step3_test;

public class TestReferenceArray1 {
	
	public static void main(String[] args) {
		
		// 배열 선언
		Person[] pa;
		pa = new Person[3]; // 배열 생성
		// 배열 요소 할당
		pa[0] = new Person("손석구",30);
		pa[1] = new Person("아이유",31);
		pa[2] = new Person("정해인",28);
		// 첫번째 요소의 name을 출력
		System.out.println(pa[0].getName());
		System.out.println(pa[0].getAge());
		System.out.println("*****************");
		for(int i = 0; i < pa.length; i++) {
			System.out.println(pa[i].getName() + " " + pa[i].getAge());
		}
	}
}
