package step6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MemoService {
	public String readMemo(String fileName) throws IOException  {
		// 파일을 입력받기 위한 클래스
		// checked Exception - 컴파일시점 예외처리 명시
		// 이 메서드를 호출한쪽으로 보내준다 
		// return은 정상흐름 throws 예외흐름 -> 응집도 높임 
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);  // FileNotFoundException
			System.out.println("A");
		// 무조건 실행되어야 하는 부분은 try 하고 finally 로 한다 
		} finally {
			if(fr!=null) // fr 객체가 null 아닐때만 close 시켜줘야함
			fr.close(); // 항상 입출력장치 닫아줌 , 추가하면 FileNotFoundException 에 부모타입 IOException을 던지면 IOException 으로 throws함 
			System.out.println("D");
		}
		return fileName + "에서 기록된 정보"; // 정상 흐름일때 동작 
	}
}
