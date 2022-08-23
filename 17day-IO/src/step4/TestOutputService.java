package step4;

import java.io.File;
import java.io.IOException;

import common.DirInfo;

public class TestOutputService {
	public static void main(String[] args) {
		OutputService service = new OutputService();
		String filePath = DirInfo.OUTPUT_TEST_PATH + File.separator + "friends.txt";
		String message = "손흥민";
		try {
			service.createFileAndWriteMessage(filePath, message);
			System.out.println("출력완료"); // 후속작업!!!
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
