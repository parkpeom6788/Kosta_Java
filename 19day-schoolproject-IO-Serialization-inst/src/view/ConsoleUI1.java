package view;

import java.util.Scanner;

public class ConsoleUI1 {
	private Scanner scanner=new Scanner(System.in);
	public void execute() {
		System.out.println("*******학사관리프로그램을 시작합니다******");
		System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
		String menu=scanner.nextLine();
		switch(menu) {
		case "5":
			System.out.println("*******학사관리프로그램을 종료합니다******");
		}
		scanner.close();
	}
}
