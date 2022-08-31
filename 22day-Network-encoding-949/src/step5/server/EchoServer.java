package step5.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  1 �� 1 ������ ���
 *  Ŭ���̾�Ʈ �����ؼ� �޼����� ������ 
 *  �Է¹޾� �ڽ��� ȭ�鿡 ����ϰ� 
 *  �ٽ� �� �޼����� Ŭ���̾�Ʈ�� ����ϴ� ������ �����Ѵ�
 *  Ŭ���̾�Ʈ�� exit ��� ���ڿ��� �����ϸ�
 *  ���� �޼����� �޾Ƶ鿩 ������ �����Ѵ�
 *  while�� �ȿ� accept ������ �ȵ� ������ �ݺ�
 *  �ʿ��� stream�� �ѹ��� ����
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			server = new ServerSocket(5432);
			System.out.println("**EchoServer ������**");
			Socket s = server.accept(); // while�� �ȿ� accept ������ �ȵ� ������ �ݺ�
			String name = s.getInetAddress().toString();
			System.out.println(name + "���� �����߽��ϴ�." );
			
			// �ʿ��� stream�� �ѹ��� ����
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
			while (true) {
				String received;
				received = br.readLine();  // Ŭ���̾�Ʈ �����ؼ� �޼����� ������ 
				System.out.println(name + "���� �޼���  : " + received); // �Է¹޾� �ڽ��� ȭ�鿡 ����ϰ�
				if(received == null || received.equalsIgnoreCase("exit")) { // Ŭ���̾�Ʈ�� exit ��� ���ڿ��� �����ϸ�
					if(server != null)
						s.close();
					System.out.println(name + "���� �������ϴ�."); // ���� �޼����� �޾Ƶ鿩 ������ �����Ѵ�
					System.out.println("**EchoServer ����**");
					break;
				}
				pw.println("Client ���� �Է¹��� �޼��� : " + received  + "*server");  //  �ٽ� �� �޼����� Ŭ���̾�Ʈ�� ����ϴ� ������ �����Ѵ�
			}
		} catch(IOException e) {
			e.printStackTrace();
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
