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
			// serverSocket.bind(new InetSocketAddress(hostAddress,PORT));  �̷��Ե� ��������
			socket = new Socket(IP.INST,5432);
			//	socket.connect(new InetSocketAddress(5432));			
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);  // autoflush
		// PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			System.out.print("���� �Է� : ");
			pw.println(scanner.nextLine());
			System.out.println("**NetClient4 ������ �޼��� ����**");
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
