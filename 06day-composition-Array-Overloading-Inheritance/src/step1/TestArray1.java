package step1;

public class TestArray1 {
	public static void main(String[] args) { // 매개변수 - 문자열 배열 
		int[] ages; // 나이들을 저장하는 배열선언 
		ages = new int[3]; // length 3 배열 생성 , 요소를 3개 담을 수 있는 배열 객체 생성 
		System.out.println(ages); // heap 메모리 영역에 생성된 배열 객체의 주소값 , ages는 스택에 저장
		System.out.println(ages.length); // 3 , 방의 개수
		// 배열객체의 첫번째 방에 값을 할당
		ages[0] = 22; // index는 0부터 시작 
		ages[1] = 44; 
		System.out.println(ages[0]); // 22
		System.out.println(ages[1]); // 44
		System.out.println(ages[2]); // 값을 안넣으면 0으로 초기화 
		System.out.println("**for loop를 이용해 ages배열의 모든 요소를 출력**");
		for(int i = 0 ; i < ages.length; i++) {  
			System.out.print(ages[i]+"\t");
		}
	}
}
