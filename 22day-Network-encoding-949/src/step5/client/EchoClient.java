package step5.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 1 �� 1 ������ ���
 * ������ ������
 * ��ĳ�ʸ� �̿��� �޼����� �����ϰ�
 * �ٽ� ������ ���� �޼����� �Է¹޾�
 * �ڽ��� �ֿܼ� ����ϴ� ������ �ݺ�
 * ����ÿ��� exit �� �Է��� ������ �޼����� �����Ͽ� 
 * �����ǻ縦 �˷��ְ� �ڽ��� ����ȴ�.
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;
		try {
			socket = new Socket("192.168.0.40",5432);  // ������ ������
			System.out.println("**EchoClinet ������ ����**");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
			while(true) {
				System.out.print("������ ���� �޼��� : ");
				scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				pw.println(message);
				
				String received = br.readLine(); // �ٽ� ������ ���� �޼����� �Է¹޾�
				System.out.println("Server ���� �Է¹��� �޼��� " + received); // �ڽ��� �ֿܼ� ����ϴ� ������ �ݺ�
				
				if(message.equalsIgnoreCase("exit")) { // ����ÿ��� exit �� �Է��� ������ �޼����� �����Ͽ� 
					if(socket != null)
						socket.close(); // �����ǻ縦 �˷��ְ� �ڽ��� ����ȴ�.
						System.out.println("**EchoClient ����**");
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
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
