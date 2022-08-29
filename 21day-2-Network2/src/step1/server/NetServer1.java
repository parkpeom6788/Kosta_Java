package step1.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		// 대표전화 , 접수처 역할
		ServerSocket serverSocket = new ServerSocket(5432); // 포트(문) 정의
		System.out.println("**NetServer1 서버 실행**");
		// accept 을 while문으로 돌려서 여러명의 고객으로 부터 입력 받을 수 있다
		
		Socket socket = serverSocket.accept();
		// 어떤 클라이언트가 접속했나 알수 있나 
		String clientIp = socket.getInetAddress().toString();
		System.out.println(clientIp + " client가 접속");
		
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		
		
		
		pw.println("Hello 아이유");
		socket.close();
		serverSocket.close();
		System.out.println("**NetSever1 서버가 클라이언트에게 메세지 출력 후 종료");
	}
	public static void main(String[] args) {
		try {
			new NetServer1().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
