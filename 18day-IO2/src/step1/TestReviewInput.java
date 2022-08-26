package step1;

import java.io.IOException;

public class TestReviewInput {
	public static void main(String[] args) {
		ReviewService service = new ReviewService();
		try {
			service.readMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
