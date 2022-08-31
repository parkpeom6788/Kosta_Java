package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 step7.serverWorker : ���� Ŭ���̾�Ʈ���� �޾Ƹ� ���񽺸� �����ϴ� ���� 
										implements Runnable
										echo() �޼��� �ϳ� ����
										Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� 
										�ڽ��� �ֿܼ� ����ϰ� �ٽ� �� �޼����� �ش� Ŭ���̾�Ʈ����
										����ϴ� ����
										exit �� ���۵Ǹ� �����带 break �����Ѵ� ( run() �� �����Ѵ� ) 
 */
public class ServerWorker implements Runnable { // implements Runnable
	private Socket socket;
	BufferedReader br = null;
	PrintWriter pw = null;
	String name = null;
	
	public ServerWorker(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			echo();
		} catch (IOException e) {
			System.out.println(name + " �� �������� �� " + e.getMessage());
		} 
	}
	public void echo() throws IOException { // echo() �޼��� �ϳ� ����
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			name = socket.getInetAddress().toString();
			System.out.println(name + " ���� �����߽��ϴ�.");
			
			while (true) {
				String message = br.readLine(); // Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� 
				System.out.println(name + " >  " + message); // �ڽ��� �ֿܼ� ����ϰ� �ٽ� �� �޼����� �ش� Ŭ���̾�Ʈ����
				pw.println(name + " >  "+message); // �ش� Ŭ���̾�Ʈ���� ����ϴ� ����
			
				if (message.equalsIgnoreCase("exit") || message == null) {
					socket.close();
					System.out.println(name +" ���� �����߽��ϴ�.");
					break; // exit �� ���۵Ǹ� �����带 break ����
				}
			}
		} catch (IOException e) { // 2. ��Ʈ�� ��⿡���� �ͼ���
			System.out.println("System Error " + e);
		}
	}
}
