package step5;

import java.io.File;
import java.io.IOException;

/*
	ByteSteam ( 1byte,8bit ) 계열의
	FileInputStream , BufferedInputStream 을 이용해 이미지 파일 정보를 입력 받고
	FileOutputStream , BufferedOutputStream 을 이용해 특정 파일에 이미지 정보를 출력하는 예제

*/
public class TestImageService {
	public static void main(String[] args) {
		ImageService service = new ImageService();
		String orgFilePath = "C:"+File.separator+"Users"+File.separator+"fight"+File.separator+"Desktop"+File.separator
				+"image1"+File.separator+"image.jpg";
		String destDirPath = "C:"+File.separator+"Users"+File.separator+"fight"+File.separator+"Desktop"+File.separator
		+"image2"+File.separator+"image.jpg";
		
		
		try {
			service.execute(orgFilePath,destDirPath);
			System.out.println("복사가 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
