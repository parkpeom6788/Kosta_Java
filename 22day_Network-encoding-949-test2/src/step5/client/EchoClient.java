package step5.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class EchoClient {
	@SuppressWarnings("resource")
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;
	try {	
		socket = new Socket("192.168.0.40",5432);
		System.out.println("**EchoClient 서버에 접속**");
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw= new PrintWriter(socket.getOutputStream(),true);
		while(true) {
			System.out.print("서버에 보낼 메세지 : ");
			scanner = new Scanner(System.in);
			String message = scanner.nextLine();
			pw.println(message);			
			String received = br.readLine();
			System.out.println("Server 에서 입력받은 메세지 " + received);
			if(message.equalsIgnoreCase("exit") || message == null) {
					socket.close();	
					System.out.println("**EchoClient 종료**");
					break;
				}
			}
		} finally {
			if(socket != null) 
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
