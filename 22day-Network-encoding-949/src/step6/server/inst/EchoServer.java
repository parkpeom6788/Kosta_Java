package step6.server.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  step5 연습예제를 step6에서 풀어보기 
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**EchoServer 실행중**");
			socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			System.out.println(clientIp+"님이 입장하셨습니다.");
			
			// 한번만 생성 
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			while(true) {
				String message = br.readLine();
				if(message == null || message.equalsIgnoreCase("exit")) {
					System.out.println(clientIp+"님이 나가셨습니다.");
					break;
				}
				System.out.println(clientIp+"님의 메세지 : " + message);
				pw.println(message+"*server*"); // readLine 으로 읽으니 println 으로 보내줌
				}
		} finally {
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
