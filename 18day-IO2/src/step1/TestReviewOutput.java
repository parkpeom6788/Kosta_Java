package step1;

import java.io.IOException;

public class TestReviewOutput {
	public static void main(String[] args) {
		ReviewService service = new ReviewService();
		String message = "화이팅";
		try {
			service.writeMessage(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
