package step6.server.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  step5 ���������� step6���� Ǯ��� 
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**EchoServer ������**");
			socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			System.out.println(clientIp+"���� �����ϼ̽��ϴ�.");
			
			// �ѹ��� ���� 
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			while(true) {
				String message = br.readLine();
				if(message == null || message.equalsIgnoreCase("exit")) {
					System.out.println(clientIp+"���� �����̽��ϴ�.");
					break;
				}
				System.out.println(clientIp+"���� �޼��� : " + message);
				pw.println(message+"*server*"); // readLine ���� ������ println ���� ������
				}
		} finally {
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
