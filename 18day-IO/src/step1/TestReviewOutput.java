package step1;

import java.io.IOException;
public class TestReviewOutput {
	public static void main(String[] args) {
		ReviewService service = new ReviewService();
		String message = "화이팅!";
	// try
		try {
			service.writeMessage(message);
			System.out.println("파일에 메세지 출력완료"); // 후속작업
		} catch (IOException e) { // catch
			e.printStackTrace();
		}
	}
}
