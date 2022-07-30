package step2;// 한줄 주석 패키지 : class 를 디렉토리별로 분류 , 색칠된곳 : 예약어 - JVM이 인식
	/* 여러줄 주석
		public : 접근 제어자 , 가장 넓은 범위의 접근 제어자 , 다른 패키지에서 접근 가능하다 
		class : class 를 정의하기 위한 자바 예약어 
		TestBasic : 개발자가 정한 클래스명 ( 파일명이기도 함 ) ,
     					camel case(카멜 표기법)으로 이름을 짓는다 (명명 규칙) => 합성어의 첫글자는 대문자  TestBasic
     					snake case Test_Basic 언더바(_) 가 들어 있는 표현 방식
	 					camel case to snake case 
	 */
public class TestBasic {
	/*
	 * main method : 프로그램 실행의 진입점  or 시작점
	 * public : 가장 넓은 범위의 접근 제어자
	 * static : 객체 생성없이 접근해 실행할 수 있는 제어자 
	 * void : 메서드 반환값이 없을 때 명시하는 자바 키워드 
	 * main : 메서드 이름 메서드는 기능이다.
	 * String[] args : 배열 
	 */
	public static void main(String[] args) {
				// new를 이용해 Person 객체 생성
		/*
		 * 	Person : 데이터 타입 
		 * p : 객체를 참조하는 변수
		 * = : 할당 또는 대입 assign 
		 * new : 객체 생성시 사용하는 자바 키워드 
		 * Person() : 생성자 constructor
		 */
				// 메모리상에 정보들을 저장함 
				Person p = new Person(); 
				// 콘솔에 출력하는 메서드
				System.out.println("Person 객체 생성" + p);  // p 객체의 주소값 , 객체의 주소값을 p에 할당된것임 
				// p 객체의 name에 이름 정보를 할당 
				p.name = "아이유";
				// p 객체의 age에 나이 정보를 할당 
				p.age = 30;
				// p 객체에 할당한 정보를 확인
				System.out.println("이름:"+p.name);
				System.out.println("나이:"+p.age);
		}
}











