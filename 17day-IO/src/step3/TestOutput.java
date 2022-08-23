package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class TestOutput {
	public static void main(String[] args) {
		String path ="C:"+File.separator+"kosta250"+File.separator+"iotest"+File.separator+"song.txt";
		File file = new File(path);
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.getPath()); // 경로 
		
		//C:\kosta250\iotest\song.txt  의 상위디렉토리 호출	
		System.out.println(file.getParent());
		// song.txt 의 상위 디렉토리 정보를 파일객체로 반환받아 디렉토리를 생성한다.
		file.getParentFile().mkdirs(); 
		FileWriter fw = null;
		PrintWriter pw = null;
		try { // NodeStream : 직접 장치에 연결
			fw = new FileWriter(file,true); // createNewFile 파일 안해도 만들어짐 fw는 컴포지션이다  , FileWriter(File file, boolean append)  append 는 덧붙이기 
			// ProcessingStream 으로 한라인씩 읽기 : 기존 스트림에 연결되어서 기능을 지원 
			pw = new PrintWriter(fw);
			pw.println("즐거운 화요일 오후");
			//pw.close(); // close에서 빨대를 닫아줘야 정보가 나간다 입출력 스트림은 사용 후 반드시 닫아줘야 한다 , buffer 임시메모리영역에 있는 데이터를 모두 출력 -> flush
							 //  파일 점유권을 해제한다는 것이다 ,  반드시 닫아줘야 하므로 finally 로 두는게 낫다 
			System.out.println("출력완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw!=null)  
			pw.close(); // close에서 빨대를 닫아줘야 정보가 나간다 입출력 스트림은 사용 후 반드시 닫아줘야 한다 , buffer 임시메모리영역에 있는 데이터를 모두 출력 -> flush
		}
	}
}
