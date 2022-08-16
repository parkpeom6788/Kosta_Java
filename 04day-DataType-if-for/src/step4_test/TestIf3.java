package step4_test;

import java.util.Scanner;

public class TestIf3 {
	public static void main(String[] args) {
		// 콘솔 : 입출력 장치
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 월을 입력하세요");
		int month = sc.nextInt();
		MyDate date = new MyDate(month);
		
		// 값을 할당하지 않으면 0으로 초기화 되므로 0을 출력하지 않게 한다 .
		if(date.getMonth() != 0) {
			System.out.println(date.getMonth() + "월에 태어남");
		}
		sc.close();
	}
}
