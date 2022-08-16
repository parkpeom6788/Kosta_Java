package step4;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		// 콘솔로부터 정보를 입력받기 위해 java.util.Scanner class를 이용한다 
		Scanner sc = new Scanner(System.in); 
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt(); // 사용자가 콘솔에 입력한 정수 정보를 반환받는다 
		System.out.println("입력한 정수 : " + num);
		sc.close(); // 파이프라인 썼으면 닫아준다 
	}
}
