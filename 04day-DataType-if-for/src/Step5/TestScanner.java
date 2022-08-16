package Step5;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		// 콘솔로부터 정보를 입력 받기 위해 java.util.Scanner class 를 이용한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int num = sc.nextInt();
		System.out.println("입력한 정수 : " + num);
		sc.close();
	}
}
