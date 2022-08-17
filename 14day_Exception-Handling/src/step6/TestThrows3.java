package step6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestThrows3 {
	
	public static void main(String[] args) {
		MemoService service = new MemoService();
		// A B C 출력결과 예상해본다 
		//String fileName="C:\\kosta250\\a.txt"; // 존재하는 파일   -> A , B 정상수행 ,   A,D,B정상수행
		String fileName="C:\\kosta250\\a2.txt"; // 존재하지 않는 파일 . 예외흐름 //  C ->  정상수행 , finally { Syso("D") 하면 A , D도 출력됨 ,    D,C정상수행 
		String result;
		try {
			// 위 readMemo 메서드가 정상흐름 일때 아래 작업을 진행한다.
			result = service.readMemo(fileName);
			System.out.println("읽은 내용 : " + result); // 후속작업은 여기서
			System.out.println("B");
			
		} catch (FileNotFoundException e) { // 밑에 IOException은 안감 Catch은 딱한번만 잡음
			System.out.println("C");
			e.printStackTrace();
		} catch (IOException e) { // add Catch 하면 부모  IOException 이 추가됨 
			e.printStackTrace();
		} 
		System.out.println("정상수행");
	}
}
