package step1;

import java.io.File;
import java.io.IOException;

public class TestFile1 {

	public static void main(String[] args) {

		String path = "C:" + File.separator + "kosta250" + File.separator + "iotest1"; // path는 경로이다.
		File dir1 = new File(path);
		System.out.println(dir1.exists()); // 존재유무
		// mkdirs는 하위 디렉터리 까지 만든다
		System.out.println("디렉토리 생성:" + dir1.mkdirs());
		// 존재하면 true
		System.out.println("존재유무 : " + dir1.exists());

		// dir1 파일객체의 경로 ( iotest1 ) 디렉토리 아래에 memo1.txt 파일 생성
		System.out.println("dir1의 경로:" + dir1.getPath());
		File file1 = new File(dir1.getPath() + File.separator + "memo1.txt");
		try {
			boolean result = file1.createNewFile(); // checked 이셉션
			System.out.println(file1.getPath() + "파일생성:" + result); // C:\kosta250\iotest1\memo1.txt 파일생성
		} catch (IOException e) {
			e.printStackTrace(); // 예외경로 + 메시지 출력
		}
	}
}
