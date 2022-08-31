package step4.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer4 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		String clientIp = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer4**");
			while(true) {
				try {
				Socket socket = serverSocket.accept(); 
				clientIp = socket.getInetAddress().toString();
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 읽어온걸 출력함
					System.out.println(clientIp + " 님 메세지 : " + br.readLine());
				} catch(Exception e) {
					System.out.println(clientIp + " " + e.getMessage());
				}
			}
		}  finally {
			if(serverSocket != null) 
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetServer4().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
