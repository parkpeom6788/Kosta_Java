package view;

import java.util.Scanner;

public class ConsoleUI2 {
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		exit: while (true) {
			System.out.println("*******학사관리프로그램을 시작합니다******");
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":
				deleteView();
				break;
			case "3":
				findView();
				break;
			case "4":
				System.out.println("전체 리스트보기");
				break;
			case "5":
				System.out.println("*******학사관리프로그램을 종료합니다******");
				break exit;// switch 문이 아니라 exit label이 지정된 while문을 벗어난다
			default:
				System.out.println("잘못된 입력값입니다!!");
			}// switch
		} // while
		scanner.close();
	}
	
	public void addView() {
		System.out.println("구성원 추가작업");
	}
	public void deleteView() {
		System.out.println("구성원 삭제작업");
	}
	public void findView() {
		System.out.println("구성원 검색작업");
	}
}
