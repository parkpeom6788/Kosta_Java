package step3.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import comm.IP;

// 클라이언트 
public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		System.out.println("** NetClient3 서버에 연결되어 메세지를 출력**");
		Socket socket = new Socket(IP.MY_IP,5432);
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		pw.println("서버한테 보내는 메시지~");
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new NetClient3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
