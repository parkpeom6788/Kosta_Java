package step1.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class NetClient1 {
	public void go() {
		try {
			// 자신의 컴퓨터 아이피로 테스트
			// Socket socket = new Socket("192.168.56.1",5432); // (서버 ip 와 , 서버(문)포트) 를 입력한다.
			// 강사 컴퓨터 아이피로 테스트 inst
			String inst = "192.168.0.34";
			Socket socket = new Socket(inst,5432); // (서버 ip 와 , 서버(문)포트) 를 입력한다.
			System.out.println("**안녕?**");
			// InputStreamReader 로 8bit ByteStream 을 16bit 단위의 CharacterStream 으로 변환
			BufferedReader br = 
			new BufferedReader(new InputStreamReader(socket.getInputStream())); // Scanner 대신 BufferedReader 로 읽어옴  InputStreamReader 16비트 짜리로 변환 
			System.out.println("서버가 보낸 메세지 :  " + br.readLine());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		new NetClient1().go();
	}
}
