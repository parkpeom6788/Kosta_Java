package step7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	
	public void go() throws IOException {
		ServerSocket socket = new ServerSocket(5432);
		System.out.println("***EchoServer가 서버 시작***");
	try {	
		while(true) {
			Socket s = socket.accept();
			ServerWorker server = new ServerWorker(s);
			Thread thread = new Thread(server);
			thread.start();
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
