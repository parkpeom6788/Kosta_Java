package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class TestOutput {
	public static void main(String[] args) {
		String path = "C:"+File.separator+"kosta250"+File.separator+"iotest"+File.separator+"song.txt";
		File file = new File(path);
		System.out.println(file.exists()); // 존재하면 true
		System.out.println(file.isFile()); // 이것은 파일인가?
		System.out.println(file.getPath()); // 경로
		
		// C:\kosta250\iotest\songtxt 의 상위디렉토리 호출
		System.out.println(file.getParent()); // 상위 디렉토리 호출
		file.getParentFile().mkdirs();
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(file,true); // createNewFile 파일 안해도 만들어짐 fw는 컴포지션 , FileWriter(File file,boolean append)
			// ProcessingStream 으로 한라인씩 읽기 : 기존 스트림에 연결되어서 기능을 지원
			pw = new PrintWriter(fw);
			pw.print("즐거운 화요일 오후");
			System.out.println("출력 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 반드시 닫아줘야 하므로 finally 에서 close 한다 
			if(pw!=null)
				pw.close();
		}
	}
}
