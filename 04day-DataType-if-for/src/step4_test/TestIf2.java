package step4_test;

import java.util.Scanner;

public class TestIf2 {
	public static void main(String[] args) {
		/*
		 * 1~13세 까지 어린이
		 * 14세 ~ 19세 까지 청소년
		 * 20세 이상은 성인
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력 : ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println(age + "세 성인");
		} else if(age >= 14) {
			System.out.println(age + "세 청소년");
		} else {
			System.out.println(age + "세 어린이");
		}
		sc.close();
	}	
}
