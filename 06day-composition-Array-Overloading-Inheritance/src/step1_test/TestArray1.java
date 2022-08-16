package step1_test;

public class TestArray1 { 
	public static void main(String[] args) { // 매개변수 - 문자열 배열 
		int[] ages;
		ages = new int[3];
		System.out.println(ages); //객체 배열의 주소 
		System.out.println(ages.length);
		ages[0] = 22;
		ages[1] = 44;
		System.out.println(ages[0]); // 22
		System.out.println(ages[1]); // 44
		System.out.println(ages[2]); // 값을 안넣으면 0으로 초기화
		
		System.out.println("**for loop를 이용해 ages 배열의 모든 요소를 출력");
		
		for(int i = 0 ; i < ages.length; i++) {
			System.out.print(ages[i]+ "\t");
		}
		
	}
}
