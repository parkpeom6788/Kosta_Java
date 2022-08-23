package step2;

import java.io.File;
import java.io.IOException;
// 디렉토리 내의 파일 및 폴더의 리스트 정보 
public class TestFileService3 {
	public static void main(String[] args) {

		String path="C:"+File.separator+"kosta250"+File.separator+"iotest1";	
		FileService service = new FileService(path);
		// 폴더 및 파일명만 출력 
//		service.printDirectoryAndFileInfo();
		
		// 폴더 및 파일명 출력시 아래와 같이 출력되게 한다
		// directory : food 
		// file : memo2.txt
		// file : memo4.txt
		// file : memo5.txt
		service.printDirectoryAndFileInfo2();
	}
}
