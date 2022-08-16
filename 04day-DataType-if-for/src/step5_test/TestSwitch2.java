package step5_test;

import java.util.Scanner;

public class TestSwitch2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		int grade = sc.nextInt();
		// break를 명시하여 해당 케이스만 실행되게 한다.
		switch(grade) {
		case 1: System.out.println("하버드"); break;
		case 2: System.out.println("컬럼비아"); break;
		case 3: System.out.println("미시건"); break;
		default : System.out.println("하와이");
		}
		sc.close();
	}
}
