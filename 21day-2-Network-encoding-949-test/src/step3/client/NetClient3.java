package step3.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

/*
 *  NetServer3 �� ������ �޼����� ����ϰ� �����ϴ� Ŭ���̾�Ʈ ���α׷� 
 */
public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=new Socket(IP.INST,5432);
		// getOutputStream() < PrintWriter   : ������ �޼����� ��� 
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
		pw.println("���� ���ִ�~�߻����~");
		System.out.println("**NetClient3 ������ ������ �޼����� ��� **");
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new NetClient3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
