package step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 서버에서 BufferedReader 
// 클라이언트에서 PrintWrtier 
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer3 서버 실행중**");
			while (true) {
				Socket socket = serverSocket.accept(); // 응답 대기
				String name = socket.getInetAddress().toString();
				System.out.println(name + "클라이언트가 접속");
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(name + " 님의 메시지 : " + br.readLine());
				socket.close();
			  }
		} finally {
			if (serverSocket != null) {
				serverSocket.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			new NetServer3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
