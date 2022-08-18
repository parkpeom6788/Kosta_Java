package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class TestConsoleIO2 {
	private static final int MACJU = 1 ; 
	private static final int SOJU = 2 ; 
	private static final int MAKGULLI = 3 ; 
	private static final int EXIT = 4 ; 
	public void show() throws IOException {
	String menu = "";
	end : while(true) {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner scanner = new Scanner(System.in);
		 int choice = 0;
			System.out.println("주종을 선택하세요 1. 맥주 2. 소주 3. 막걸리 4. 종료");
			choice = Integer.parseInt(br.readLine());
		switch(choice) {
			case  MACJU :  menu ="맥주"; break;
			case    SOJU :  menu ="소주"; break;
			case	MAKGULLI :  menu ="막걸리"; break;
			case  EXIT : break end;
			default :
				menu = null;
				System.out.println("잘못된 입력값 입니다.");
			}
		if(menu != null) {
			System.out.println(menu +" 를 선택하였습니다.");
			}
		}
 	System.out.println("주문 프로그램을 종료합니다");
	}
	public static void main(String[] args) {
		try {
			new TestConsoleIO2().show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
