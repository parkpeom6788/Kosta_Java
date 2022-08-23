package step5;

import java.io.File;
import java.io.IOException;
import common.DirInfo;

public class TestOutputService2 {
	public static void main(String[] args) {
		String filePath=DirInfo.OUTPUT_TEST_PATH+File.separator+"player.txt";
		OutputService2 service = new OutputService2(filePath);
		try {
			service.writePlayer(); // scanner 정보 입력받음
			System.out.println("선수명단 출력을 완료했습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}
