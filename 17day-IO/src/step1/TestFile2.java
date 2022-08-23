package step1;

import java.io.File;
import java.io.IOException;

public class TestFile2 {
	public static void main(String[] args) {
		
		File dir = new File("C:"+File.separator+"kosta250"+File.separator+"iotest1");
		
		// 디렉토리면 true
		System.out.println("디렉토리 여부:"+dir.isDirectory()); 
		System.out.println("파일 여부:"+dir.isFile()); // 파일이냐?
		
		// dir 내부에 memo2.txt ~ memo5.txt 까지 생성한다
		/*
		 * for
		 * 	File f = new File(dir.getPath()+File.separator+memo변수
		 */	
		for(int i=2; i<=5; i++) {
			File f = new File(dir.getPath() + File.separator + "memo"+i+".txt"); //  C:\kosta250\iotest1\  여기서만듬 
			System.out.println("생성 완료");
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
