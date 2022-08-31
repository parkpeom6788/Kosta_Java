package step6.client.inst;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import common.IP;
/*
	������� Ǯ��
 */
public class EchoClient {
	public void go() throws IOException {
		Socket socket = null;
		Scanner scanner = null;
		try {
			socket = new Socket(IP.INST,5432);
			System.out.println("**EchoClient�� ������ ����**");
			scanner = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
			while(true) {
				System.out.print("������ ���� �޼���:");
				String message = scanner.nextLine(); // ������ ���� �޼�����  �ֿܼ��� �Է¹޴´�
				
				pw.println(message); // ������ �޼����� �����Ѵ�
				
				if(message.equalsIgnoreCase("exit")) {
					System.out.println("**EchoClient �����մϴ�**");
					break;
				}
				System.out.println("�������� �Է¹��� �޼��� : " + br.readLine()); // �������� �Է¹��� �޼���
				}
		} finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
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
