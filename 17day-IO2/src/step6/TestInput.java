package step6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.DirInfo;

public class TestInput {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// 입력 NodeStream 파일에 연결되는 스트림 
			FileReader fr = new FileReader(DirInfo.OUTPUT_TEST_PATH+File.separator+"friends.txt");
			// 입력 ProcessingStream(성능에도 엄청 유리함)
			br = new BufferedReader(fr);
			System.out.println("입력스트림생성");
			System.out.println(br.readLine());
			String message = null;
			while((message = br.readLine()) != null) {
				System.out.println(message);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
			}
		}	
	}
}
