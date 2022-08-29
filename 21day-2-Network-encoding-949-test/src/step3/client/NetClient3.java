package step3.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

/*
 *  NetServer3 에 접속해 메세지를 출력하고 종료하는 클라이언트 프로그램 
 */
public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=new Socket(IP.INST,5432);
		// getOutputStream() < PrintWriter   : 서버로 메세지를 출력 
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
		pw.println("정우 멋있다~잘생겼다~");
		System.out.println("**NetClient3 서버에 연결해 메세지를 출력 **");
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
