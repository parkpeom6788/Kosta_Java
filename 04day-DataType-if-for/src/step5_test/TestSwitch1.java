package step5_test;

import java.util.Scanner;

public class TestSwitch1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		int grade = sc.nextInt();
		switch(grade) {
		case 1: System.out.println("하버드");
		case 2: System.out.println("컬럼비아");
		case 3: System.out.println("미시건");
		default :
			System.out.println("하와이");
		}
		sc.close();
	}
}
