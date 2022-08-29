package step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  client ������ ����ϴ� �����ϸ� Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� 
 *  ���� �ڽ��� ȭ�鿡 �� �޼����� ����ϴ� �۾��� 
 *  Ŭ���̾�Ʈ ���ӽø��� �ݺ��Ѵ� 
 */
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			// while loop ������ accept , socket�� �Է½�Ʈ������ �Է��� �ֿܼ� ���
			while (true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp + " Ŭ���̾�Ʈ�� ����");
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(clientIp + " ���� �޼���:" + br.readLine());
				socket.close();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new NetServer3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}