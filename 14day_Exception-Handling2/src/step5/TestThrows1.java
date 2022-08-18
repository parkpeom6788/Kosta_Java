package step5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows1 {
	public static void main(String[] args) {  // Checked Exception
		try {
			FileReader fr = new FileReader("C:\\kosta250\\a.txt"); // FileNotFoundException
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("정상 수행");
	}
}
