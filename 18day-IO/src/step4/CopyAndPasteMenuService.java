package step4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyAndPasteMenuService {
	/*
		orgFilePath 경로의 파일을 복사해서 
		destDirPath 경로 디렉토리 하위에 동일한 파일명으로 
		붙여넣게 하는 메서드 
		destDirPath 의 디렉토리가 없다면 생성 한다 
		BufferedReader > FileReader
		PrintWriter > FileWriter
		try  ~ finally
		loop : ready() , readLine() , println()  
	*/
	public void execute(String orgFilePath, String destDirPath) throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		File file2 = new File(destDirPath);
		if(file2.exists()) {
			file2.createNewFile();
		}
		try {
			br = new BufferedReader(new FileReader(orgFilePath));
			pw = new PrintWriter(new FileWriter(destDirPath));
			while(br.ready()) {
				String message = br.readLine();
				pw.println(message);
			}
		} finally {
			if(br != null)
			br.close();
			if(pw != null)
			pw.close();
		}
	}
}
