package step4.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class NetClient4 {	
	
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket(IP.MY_IP,5432);
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			System.out.print("내용 입력 : ");
			pw.println(scanner.nextLine());
			System.out.println("**NetClient4 서버에 메세지 전송**");
		} finally {
			if(socket != null)
				socket.close();
			if(scanner != null)
				scanner.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetClient4().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
