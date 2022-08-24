package step5;

import java.io.File;
import java.io.IOException;

import common.DirInfo;
import step4.OutputService;

public class TestOutputService2 {
	public static void main(String[] args) throws IOException {
		String filePath = DirInfo.OUTPUT_TEST_PATH+File.separator+"player.txt";
		
		OutputService2 service = new OutputService2(filePath);
		
		service.writePlayer();
		System.out.println("선수명단 출력을 완료했습니다");
	}
}
