package step5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows2 {
	// main 에서 throws 한다는 것은 실행의 주체인 jvm에게 해당 Exception 을 전달하겠다는 의미 -> 프로그램 종료함 
	// 예외처리를 하지 않겠다는 의미 , 단순히 ChecekdException 에 의한 compile error 를 피하는 용도 
	public static void main(String[] args) throws FileNotFoundException {
		// 이셉션에는 checked , unchecked가 있는데 checked는 컴파일시점에 에러처리이므로 표시가 나고 
		// 런타임에 이셉션은 이표시가 나지않는다
		FileReader fr = new FileReader("C:\\kosta250\\a.txt");
		System.out.println(fr + " file.read");
		System.out.println("정상 수행");
	}
}
