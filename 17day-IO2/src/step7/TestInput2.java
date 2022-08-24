package step7;

import java.io.IOException;

public class TestInput2 {
	
	public static void main(String[] args) {
		InputService service = new InputService();
		try {
			service.printReadFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
