package step2.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer2 {
		
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer2 서버 실행중**");
			
			while(true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp + " 클라이언트가 접속");
				
				PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
				pw.println(clientIp + "님 방가방가");
				socket.close();
			  }
		} finally {
			if(serverSocket != null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetServer2().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
