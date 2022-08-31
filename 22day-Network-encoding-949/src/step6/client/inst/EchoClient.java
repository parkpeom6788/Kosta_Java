package step6.client.inst;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import common.IP;
/*
	강사님이 풀기
 */
public class EchoClient {
	public void go() throws IOException {
		Socket socket = null;
		Scanner scanner = null;
		try {
			socket = new Socket(IP.INST,5432);
			System.out.println("**EchoClient가 서버에 접속**");
			scanner = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
			while(true) {
				System.out.print("서버에 보낼 메세지:");
				String message = scanner.nextLine(); // 서버에 보낼 메세지를  콘솔에서 입력받는다
				
				pw.println(message); // 서버에 메세지를 전송한다
				
				if(message.equalsIgnoreCase("exit")) {
					System.out.println("**EchoClient 종료합니다**");
					break;
				}
				System.out.println("서버에서 입력받은 메세지 : " + br.readLine()); // 서버에서 입력받은 메세지
				}
		} finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
