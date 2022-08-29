package step1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class NetClient1 {
	public void go() {
		try {
			String inst = "192.168.0.34";
			Socket socket = new Socket(inst,5432);
			System.out.println("**안녕?**");
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println("서버가 보낸 메시지 : " + br.readLine()); // 읽어오기 
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new NetClient1().go();
	}
}
