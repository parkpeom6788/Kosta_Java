package step2;

import java.io.File;
import java.io.IOException;
// 파일 이동 테스트 
// iotest1 -> itest2로  memo1.txt 이동시키기 
public class TestFileService2 {
	public static void main(String[] args) {
		// 원본파일이 존재하는 경로 
		String path="C:"+File.separator+"kosta250"+File.separator+"iotest1";	
		FileService service = new FileService(path);
		
		String fileName ="memo1.txt"; // 원본파일 명 
		// 이동시킬 디렉토리 
		String destDir = "C:"+File.separator+"kosta250"+File.separator+"iotest2";
		
		boolean result = service.moveFile(fileName,destDir);
		System.out.println(fileName + " 이동 : " + result);
		
	}
}
