package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
	orgFilePath 경로의 파일을 복사해서 
	destDirPath 경로 디렉토리 하위에 동일한 파일명으로
	붙여넣게 하는 메서드
	destDirPath 의 디렉토리가 없다면 생성한다
	BufferedReader > FileReader
	PrintWriter > FileWriter
	try ~ finally
	loop : ready() , readLine() , println()
*/
public class CopyAndPasteMenuService {

	public void execute(String orgFilePath, String destFilePath) throws IOException {
		BufferedReader br = null;
		BufferedWriter pw = null;
		String message = null;
		File file2 = new File(destFilePath);
		if(file2.isDirectory() == false) {
			file2.mkdirs();
		}
		try {
			br = new BufferedReader(new FileReader(orgFilePath));
			pw = new BufferedWriter(new PrintWriter(destFilePath));
			while((message=br.readLine()) != null) {
				pw.write(message + "\n"); // pw.println 을 많이씀 
			}
		} finally {
			if(br != null) 
				br.close();
			if(pw != null)
				pw.close();
		}
	}
}
