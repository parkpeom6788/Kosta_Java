package step7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
	step7.MultiServer : ServerSocket(대표전화) accept() 를 통해 클라이언트가 접속하면
										해당 클라이언트와 연결된 Socket(직원 전화기)을 반환받고
										이를 ServerWorker 객체 생성시 할당한 후
										Thread 를 생성해 start 시키는 동작을 반복한다 
*/
public class MultiServer {
	public void go() throws IOException {
		ServerSocket socket = new ServerSocket(5432);
		System.out.println("***EchoServer가 서버 시작***");
	try {	
		while(true) {
			Socket s = socket.accept();
			ServerWorker worker = new ServerWorker(s);
			Thread serverThread = new Thread(worker);
			serverThread.start();
			serverThread.setDaemon(true);
			}
		} finally {
			if(socket != null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
