package step5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows1 {
	public static void main(String[] args) { // checked Exception  FileNotFoundException
		try {
			// file 실제로 존재하면 정상적으로 입력작업처리
			// file 이 존재하지 않으면 FileNotFoundException 발생되어 throws되고 catch이 실행된다.
			// java se api 에서 제공하는 fileReader 클래스의 생성자에서 throws 하는 케이스
			FileReader fr = new FileReader("C:\\kosta250\\a.txt");  // a2 는 존재하지 않는 파일
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		System.out.println("정상 수행");
	}
}
