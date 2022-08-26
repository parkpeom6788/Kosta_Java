package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*  System.in 과 InputStreamReader , BufferedReader 를 이용해
 *  콘솔로부터 데이터를 입력받는 예제
 *  System.in : 콘솔에 연결되는 1byte 단위의 NodeStream
 *  InputStreamReader : 1byte 단위의 ByteStream을 2byte 단위의 CharacterStream 으로 변환하는 스트림  
 */
public class TestInputStreamReader {
	public static void main(String[] args)  {
		InputStream is = System.in; // 1byte nodestream
		InputStreamReader ir = new InputStreamReader(is); // 1byte 단위가 2byte 로 바뀜 (빨대가굵어짐
		BufferedReader br = new BufferedReader(ir); // 16비트 2바이트를 받아서 처리함 - 1바이트가 못옴
		System.out.print("응원메세지:");

		String message;
		try {
			message = br.readLine();
			System.out.println("입력 내용 : " + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
