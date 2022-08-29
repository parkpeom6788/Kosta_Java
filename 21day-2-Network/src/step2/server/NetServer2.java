package step2.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 클라이언트가 접속하면 데이터를 출력하고 접속 해제 후
 * 다시 대기
 * 다른 클라이언트가 접속하면 데이터를 출력하고 접속 해제 후
 * 다시 대기 
 * 다수의 클라이언트를 순차적으로 접수받아 출력 서비스하는 서버
 * 
 * while(true) {
 * 		Socket socket = serverSocket.accept();
 * 		socket.getOutputStream();
 * 		socket.close()
 * }
 */
// NetServer2 서버를 실행하고 step1의 NetClient1을 실행해서 테스트 하면 된다.
public class NetServer2 { // ServerSocket 대표전화 Socket 직원전화
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer2 서버 실행중**");
			
			while (true) {

				Socket socket = serverSocket.accept(); // 대기 하다가 클라이언트 접속하면 실행 , 소켓(직원전화기)을 반환
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp + " 클라이언트가 접속");
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true); // 클라이언트한테 보냄 , autoflush: 버퍼에있는걸 즉시
																					// 배출
				pw.println(clientIp + "님 방가방가");
				socket.close();	
			  }
		} finally {
			if (serverSocket != null)
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
