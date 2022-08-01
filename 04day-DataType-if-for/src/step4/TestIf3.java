package step4;

import java.util.Scanner;

public class TestIf3 {
	public static void main(String[] args) {
		// 콘솔 : 입출력 장치
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 월을 입력하세요:");
		int month = sc.nextInt(); // 사용자가 콘솔에 입력한 데이터를 받아온다 
		MyDate date = new MyDate(month);
	
		// 값을 할당하지않으면 0 으로 초기화 되므로 0을 출력하지 않게 함
		if(date.getMonth() != 0) {
			System.out.println(date.getMonth()+"월에 태어남");			
		}
		sc.close();
	}
}
