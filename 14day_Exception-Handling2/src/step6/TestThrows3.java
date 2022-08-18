package step6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrows3 {
	
	public static void main(String[] args) {
		MemoService service = new MemoService();
		String fileName = "C:\\kosta250\\a2.txt";
		String result;
		try {
			result = service.readMemo(fileName);
			System.out.println("읽은 내용 : " + result);
			System.out.println("B");
		}catch(FileNotFoundException e) {
			System.out.println("C");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("정상수행");
	}
}
