package step1;

import java.io.IOException;

public class TestReviewInput2 {
	public static void main(String[] args) {
		ReviewService service = new ReviewService();
		
		try {
			service.readMessage2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
