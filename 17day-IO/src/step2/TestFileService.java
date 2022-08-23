package step2;

import java.io.File;
import java.io.IOException;
// 파일 삭제 테스트 
public class TestFileService {
	public static void main(String[] args) {
		String path="C:"+File.separator+"kosta250"+File.separator+"iotest1";
		
		File f = new File(path+File.separator+"memo3.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileService service = new FileService(path);
		String fileName ="memo3.txt";
		boolean result =service.deleteFile(fileName);
		// 파일이 삭제되면 true를 출력 아니면 fasle
		System.out.println(fileName +" 삭제" + result);
	}
}
