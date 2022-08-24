package step3;

import java.io.IOException;

public class TestConsoleInputFileOutput {
	public static void main(String[] args) {
		ConsoleInputFileOutputService service = new ConsoleInputFileOutputService();
		try {
			service.execute();
			System.out.println("점심 메뉴 주문 완료되었습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
