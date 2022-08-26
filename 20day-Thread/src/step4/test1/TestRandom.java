package step4.test1;
import java.util.Random;
public class TestRandom {
	public static void main(String[] args) {
		// mp3 , avi 분리 방법 
		Random random = new Random();
		System.out.println(random.nextBoolean());
		System.out.println(random.nextBoolean());
		System.out.println(random.nextBoolean());
		String ext=".avi";
		if(random.nextBoolean()) 
			ext=".mp3";
		String fileName = "test"+ext;
		System.out.println(fileName);
		System.out.println(fileName.endsWith(".mp3")); // 파일명 끝이 mp3면 true
	}
}
