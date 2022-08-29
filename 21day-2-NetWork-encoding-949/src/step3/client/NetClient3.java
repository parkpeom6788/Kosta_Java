package step3.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import comm.IP;
/*
 * NetServer3 에 접속해 메세지를 출력하고 종료하는 클라이언트 프로그램
 */
public class NetClient3 {
	public void go() throws UnknownHostException, IOException {	
		System.out.println("**NetClient3 서버에 연결되어 메세지를 출력**");
		//getOutputStream() < PrintWriter : 서버로 메세지를 출력
		Socket socket = new Socket(IP.INST,5432); // 내 아이피로 접속 , 서버포트는 5432
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true); // 즉시메시지 출력 autoflush
		pw.println("한글");
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
