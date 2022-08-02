package step2;
/*
- 객체 초기화 단계
	: 객체 생성시 초기화는 다음과 같은 단계를 거친다 ( 이후 상속 공부시에 더 추가될 예정 )
	1 ) 인스턴스 변수의 기본 초기화 ( 0 or false or null ) 
	2) 인스턴스 변수의 명시적 초기화  = 이퀄했을때 
	3) 생성자에 의한 초기화 
	step2 예제에서 확인해본다
*/ 
public class TestObjectInit {
	public static void main(String[] args) {
		MyDate date = new MyDate(9);
		// boolean 형은 false 로 기본 초기화 
		System.out.println(date.flag); // false 
		// 실수형 double은 0.0
		System.out.println(date.num);// 0.0
		// 참조형 String은 null 
		System.out.println(date.str); // null
		System.out.println("*****결과예상*****");
		System.out.println(date.day1);  // 0  기본초기화
		System.out.println(date.day2); // 7	명시적 초기화
		System.out.println(date.day3); // 9  생성자에의한 초기화
	}
	
}
