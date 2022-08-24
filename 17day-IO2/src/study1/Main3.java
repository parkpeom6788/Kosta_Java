package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/* 콘솔에서 여러 줄을 읽는 또 다른 방법은 동기화된 BufferedReader Java의 클래스 , 
 * readLine() 방법 및 사용 String.split() 공백을 구분 기호로 사용하여 줄을 개별 토큰으로 분할 
 * 우리는 또한 사용할 수 있다.
 * StringTokenizer 수업  
 */
public class Main3 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while((line = br.readLine()) != null) {
				String[] tokens = line.split("\\s"); // 공백을 구분하여 배열에 넣음 
				System.out.println(Arrays.toString(tokens)); // Arrays.toString()  배열 출력 
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
