package step3;

public class TestReferenceArray2 {
	
	public static void main(String[] args) {
		// 참조형 데이터 저장 배열의 선언 , 생성 , 할당 , 동시에 
		Person[] pa = {new Person("손석구",30),
				new Person("아이유",31),
				new Person("유재석",50)};
		int num = 40;
		// num 미만인 요소들의 name 과 age를 출력 
		for(int i = 0; i < pa.length; i++) {
			if(pa[i].getAge() < num) {
				System.out.println(pa[i].getName() + " " + pa[i].getAge());
			}
		}
	}
}
