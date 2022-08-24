package step4;
import java.io.File;
import java.io.IOException;
import common.DirInfo;
public class TestOutputService {
	public static void main(String[] args) throws IOException {
		OutputService service = new OutputService();
		String filePath = DirInfo.OUTPUT_TEST_PATH+File.separator+"friend.txt";
		String message = "손흥민";
		service.createFileAndWriteMessage(filePath,message);
		System.out.println("출력완료");
	}
}
