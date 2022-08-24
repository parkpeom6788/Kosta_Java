package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
	
	public static void main(String[] args) {
		
		String fileName;
		// 1. inputStreamReader 객체 생성 ( 바이트 스트림을 문자 스트림으로 변환 )
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			fileName = br.readLine(); // 한줄 단위로 처리하는 readLine() 메서드
			System.out.println(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
