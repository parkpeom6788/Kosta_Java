package Step5;

import java.util.Scanner;

public class TestSwitch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요:");
		DateService service = new DateService();
		service.printLastDay(sc.nextInt());
		
		if(service.getMonth() != 0) {
			service.getDay();
		}
		sc.close();
	}
}
