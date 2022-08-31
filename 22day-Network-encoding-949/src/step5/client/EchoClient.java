package step5.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 1 대 1 지속적 통신
 * 서버에 접속해
 * 스캐너를 이용해 메세지를 전송하고
 * 다시 서버가 보낸 메세지를 입력받아
 * 자신의 콘솔에 출력하는 동작을 반복
 * 종료시에는 exit 를 입력해 서버에 메세지를 전송하여 
 * 종료의사를 알려주고 자신은 종료된다.
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;
		try {
			socket = new Socket("192.168.0.40",5432);  // 서버에 접속해
			System.out.println("**EchoClinet 서버에 접속**");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
			while(true) {
				System.out.print("서버에 보낼 메세지 : ");
				scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				pw.println(message);
				
				String received = br.readLine(); // 다시 서버가 보낸 메세지를 입력받아
				System.out.println("Server 에서 입력받은 메세지 " + received); // 자신의 콘솔에 출력하는 동작을 반복
				
				if(message.equalsIgnoreCase("exit")) { // 종료시에는 exit 를 입력해 서버에 메세지를 전송하여 
					if(socket != null)
						socket.close(); // 종료의사를 알려주고 자신은 종료된다.
						System.out.println("**EchoClient 종료**");
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
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
