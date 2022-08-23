package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import common.DirInfo;

public class InputService {
	public void printReadFile() throws IOException {
		BufferedReader br = null;  // 지역변수는 명시적 초기화가 필요하다
		String message = null;
		try {
			br = new BufferedReader(new FileReader(DirInfo.OUTPUT_TEST_PATH + File.separator + "friends.txt"));
			while((message = br.readLine()) != null) { // message가 null 이 아닐동안 반복하는데 다음 라인을 반복해서 입력받는다
				System.out.println("입력내용:"+message);
			}
		} finally {
			if(br != null)
				br.close();
		}
	} // method
}// class
