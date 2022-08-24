package step2;

import java.io.File;

// 디렉토리 내의 파일 및 폴더의 리스트 정보 
public class TestFileService3 {
	public static void main(String[] args) {
		
		String path = "C:"+File.separator +"kosta250" + File.separator + "iotest1";
		FileService service = new FileService(path); // 컴포지션 관계
		
		service.printDirectoryAndFilesInfo2();
	
	}
}
