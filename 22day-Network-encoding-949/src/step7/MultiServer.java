package step7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
	step7.MultiServer : ServerSocket(��ǥ��ȭ) accept() �� ���� Ŭ���̾�Ʈ�� �����ϸ�
										�ش� Ŭ���̾�Ʈ�� ����� Socket(���� ��ȭ��)�� ��ȯ�ް�
										�̸� ServerWorker ��ü ������ �Ҵ��� ��
										Thread �� ������ start ��Ű�� ������ �ݺ��Ѵ� 
*/
public class MultiServer {
	public void go() throws IOException {
		ServerSocket socket = new ServerSocket(5432);
		System.out.println("***EchoServer�� ���� ����***");
	try {	
		while(true) {
			Socket s = socket.accept();
			ServerWorker worker = new ServerWorker(s);
			Thread serverThread = new Thread(worker);
			serverThread.start();
			serverThread.setDaemon(true);
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
