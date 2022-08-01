package step4;
import java.util.Scanner;

public class TestIf2 {
	public static void main(String[] args) {
	/*
	 * 1~13세까지 어린이 
	 * 14세~19세까지 청소년 
	 * 20세 이상은 성인 
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt(); // 사용자가 콘솔에 입력한 나이 정보를 받아온다 
		if(age > 19) { // 19세 초과하면 
			System.out.println(age+"세 성인");
		} else if(age > 13) { // 13세 초과하면
			System.out.println(age+"세 청소년");
		} else { // 13세 이하 나머지 
			System.out.println(age+"세 어린이");
		}
		sc.close();
	}
}
