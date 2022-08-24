package step4_solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyAndPasteMenuService {
	/*
	 * -- 강사님이 푸신거 --
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
		File destDir = new File(destDirPath);
		if(destDir.isDirectory()==false) // 폴더가 없으면 
			destDir.mkdirs(); // 디렉토리가 없으면  폴더 생성 한다.
		BufferedReader br = null;
		PrintWriter pw = null;
	 try {
		 	 File orgFile = new File(orgFilePath);
			 br = new BufferedReader(new FileReader(orgFilePath));
			 //String destFileName = new File(orgFilePath).getName(); // 파일명을 얻어오기 위함
			 pw = new PrintWriter(new FileWriter(destDirPath+orgFile.getName()));
			 while(br.ready()) {
				 pw.println(br.readLine()); // 읽어가지고 바로 출력
			  }
		} finally {
			if(br!=null)
				br.close();
			if(pw!=null)
				pw.close();
		} // 
	} // method
} // class
