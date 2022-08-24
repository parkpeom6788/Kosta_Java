package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	public OutputService() {
	}

	public void createFileAndWriteMessage(String filePath, String message) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filePath, true));
			pw.println(message);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally { // 반드시 닫아줘야하는건 finally 로 함 ctrl + shift + f
			if (pw != null)
				pw.close();
		}
	}
}
