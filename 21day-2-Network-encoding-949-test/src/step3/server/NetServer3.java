package step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  client 접속을 대기하다 접속하면 클라이언트가 보낸 메세지를 입력받아 
 *  서버 자신의 화면에 그 메세지를 출력하는 작업을 
 *  클라이언트 접속시마다 반복한다 
 */
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			// while loop 내에서 accept , socket의 입력스트림으로 입력해 콘솔에 출력
			while (true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp + " 클라이언트가 접속");
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(clientIp + " 님의 메세지:" + br.readLine());
				socket.close();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
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
