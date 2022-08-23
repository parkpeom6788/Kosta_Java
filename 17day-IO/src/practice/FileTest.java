package practice;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		String path = "C:"+File.separator+"kosta250"+File.separator+"iotest3";
		File origfile = new File(path);
		origfile.mkdirs(); // 디렉토리 생성
		
		String filename = "test1.txt";
		
		File dir1 = new File(path+File.separator+filename); // 파일생성 
		// getPath() 경로 getName() 파일이름

		try {
			dir1.createNewFile();
			System.out.println("파일을 생성하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		//boolean file = dir1.delete(); // 삭제 
		//새로운 파일 객체
		String dest = "C:"+File.separator+"kosta250"+File.separator+"iotest4";
		new File(dest).mkdirs(); // 디렉토리 생성
		
		File destfile = new File(dest+File.separator+"test1.txt");
		
		// 이동시킴
		dir1.renameTo(destfile);	
		File find = new File("C:"+File.separator+"kosta250");
		String[] list = find.list();
		for(String s : list) {
			System.out.println("모든 파일 : " + s);
		}
		
		File[] flist = find.listFiles();
		for(File f : flist) {
			if(f.isDirectory()) {
				System.out.println("디렉토리 : " + f.getName());
			} else if(f.isFile()) {
				System.out.println("파일 : " + f.getName());
			}
		}
	}
}
