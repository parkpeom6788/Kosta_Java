package step3;

import java.util.Scanner;

public class TestConsoleIO1 {
	/*
	 * 불금메뉴
	 * 메뉴를 입력하세요 : 피자
	 * 피자 주문!
	 * 메뉴를 입력하세요 : 콜라
	 * 콜라 주문!
	 * 메뉴를 입력하세요 : 치킨
	 * 치킨 주문!
	 * 메뉴를 입력하세요:주문끝 
	 * 메뉴 주문이 완료되었습니다
	 * while(true) {
	 * 	if(비교)
	 *     break;
	 *  }
	 */
	public void view() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("불금 메뉴");
		while(true) {
			System.out.print("메뉴를 입력하세요 : ");
			scanner.nextInt();
		}
	}
}
