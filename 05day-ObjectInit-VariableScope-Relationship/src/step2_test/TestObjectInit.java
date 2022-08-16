package step2_test;

public class TestObjectInit {
	
	public static void main(String[] args) {
		
		MyDate date = new MyDate(9);
		System.out.println(date.flag); // false
		System.out.println(date.num); // 0.0
		
		System.out.println(date.str);
		System.out.println("*****결과 예상*****");
		System.out.println(date.day1);
		System.out.println(date.day2);
		System.out.println(date.day3);
	}
}
