package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	/**
	 * NodeStream 계열인 FileWriter 를 생성한다
	 * FilePath 를 인자값으로 전달하고 append 기능을 위해 true를 할당한다
	 * 
	 * ProcessingStream 계열인 PrintWriter 를 생성한다
	 * println(message) 를 이용해 파일에 정보를 출력한다
	 * 
	 * 사용한 스트림을 반드시 닫아주기 위해 close()를 실행한다 -> try ~ finally
	 * close() : 자원을 다 사용했음을 시스템에게 알리고 버퍼의 데이터를 모두 출력(flush) 
	 * @param message
	 * @throws IOException 
	 */
	public void createFileAndWriteMessage(String filePath, String message) throws IOException {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
	//		fw = new FileWriter(filePath, true);
			pw = new PrintWriter(new FileWriter(filePath,true));
			pw.println(message);
		} finally { // 반드시 닫아줘야 하는건 finally 로 , ctrl+shift+f ->코드정리
			if (pw != null)
				pw.close();
		}
	}
}

