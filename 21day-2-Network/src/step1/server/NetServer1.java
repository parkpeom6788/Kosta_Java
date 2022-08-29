package step1.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		// 대표전화  , 접수처 역할
		ServerSocket serverSocket = new ServerSocket(5432); // 포트(문) 정의 
		// 클라이언트 접속을 대기 , 클라이언트가 접속하면 실행 , 클라이언트의 연결 정보를 가진 Socket을 반환 ( 직원 전화기 ) 
		System.out.println("**NetServer1 서버 실행**");
	
		// accept 을 while문으로 돌려서 여려명의 고객으로부터 입력받을수있다
		Socket socket = serverSocket.accept(); 
		// 어떤클라이언트가 접속했는지 알수있다
		String clientIp = socket.getInetAddress().toString();
		System.out.println(clientIp+" client 가 접속");
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true); // getOutputStream() 는 OutputStream으로 쓸수있다.
		pw.println("Hello 아이유");															   // tue = AutoFlush
		socket.close();
		serverSocket.close();
		System.out.println("**NetServer1 서버가 클라이언트에게 메세지 출력 후 종료**");
	}
	public static void main(String[] args) {
		try {
			new NetServer1().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
