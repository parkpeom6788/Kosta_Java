package step2;

public class MyDate {
	// 테스트를 위해 인스턴스 변수의 접근 제어자를
	// private 으로 하지 않고 default 로 설정한다 
	boolean flag; // 인스턴스 변수 boolean 형은 선언만 하면 false 
	double num; // 인스턴스 변수 double형은 0.0으로 초기화 
	String str; // 인스턴스 변수 String 형은 null 로 초기화 
	int day1; // 0
	int day2 = 7; // 인스턴스 변수에 명시적 초기화(할당)  를 시킴 
	int day3 = 8; // 인스턴스 변수에 명시적 초기화를 시킴 
	public MyDate(int day3) {
		this.day3 = day3;
	}
	
	
}















