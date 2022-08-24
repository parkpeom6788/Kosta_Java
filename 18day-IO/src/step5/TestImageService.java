package step5;

import java.io.FileNotFoundException;
import java.io.IOException;

import common.Path;
/*
 	ByteStream (	1byte, 8bit  ) 계열의 
 	FileInputStream , BufferedInputStream 을 이용해 이미지 파일 정보를 입력 받고
 	FileOutputStream , BufferedOutputStream 을 이용해 특정 파일에 이미지 정보를 
 	출력하는 예제 
 */
public class TestImageService {
	public static void main(String[] args) {
		ImageService service = new ImageService();
		String orgFilePath = Path.TEST_DIR+"image.png";
		String destDirPath = Path.DEST_DIR;
		try {
			service.execute(orgFilePath,destDirPath);
			System.out.println("이미지 입력,출력 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
