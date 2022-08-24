package test;
import java.io.File;
import java.io.IOException;
import common.Path;
public class App {
	public static void main(String[] args) {
		String originalpath = Path.TEST_DIR+File.separator+"menu.txt";	
		String movepath  = "C:"+File.separator+"kosta250"+File.separator+"iotest3"+File.separator+"menu.txt";
		CopyTest cp = new CopyTest();
		try {
			Object memo = cp.readFile(originalpath);
			cp.writeFile(movepath,memo);
			System.out.println("복사가 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
