package step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 서버에서 BufferedReader
// 클라이언트에서 PrintWriter

/* 상황
 *  client 접속을 대기하다 접속하면 클라이언트가 보낸 메세지를 입력받아 
 *  서버 자신의 화면에 그 메세지를 출력하는 작업
 *  클라이언트 접속시마다 반복한다.
 */
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer3 서버 실행중**");
			while (true) { // while loop 내에서 accept , socket의 입력스트림
				Socket socket = serverSocket.accept();
				String name = socket.getInetAddress().toString();
				System.out.println(name + "클라이언트가 접속");
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(name + " 님의 메세지 : " + br.readLine());
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
