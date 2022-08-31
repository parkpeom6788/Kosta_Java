package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 step7.serverWorker : 실제 클라이언트에게 메아리 서비스를 제공하는 역할 
										implements Runnable
										echo() 메서드 하나 만듬
										클라이언트가 보낸 메세지를 입력받아 
										자신의 콘솔에 출력하고 다시 그 메세지를 해당 클라이언트에게
										출력하는 역할
										exit 가 전송되면 스레드를 break 종료한다 ( run() 을 종료한다 ) 
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
			System.out.println(name + " 님 강제종료 함 " + e.getMessage());
		} 
	}
	public void echo() throws IOException { // echo() 메서드 하나 만듬
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			name = socket.getInetAddress().toString();
			System.out.println(name + " 님이 입장했습니다.");
			
			while (true) {
				String message = br.readLine(); // 클라이언트가 보낸 메세지를 입력받아 
				System.out.println(name + " >  " + message); // 자신의 콘솔에 출력하고 다시 그 메세지를 해당 클라이언트에게
				pw.println(name + " >  "+message); // 해당 클라이언트에게 출력하는 역할
			
				if (message.equalsIgnoreCase("exit") || message == null) {
					socket.close();
					System.out.println(name +" 님이 퇴장했습니다.");
					break; // exit 가 전송되면 스레드를 break 종료
				}
			}
		} catch (IOException e) { // 2. 스트림 얻기에대한 익셉션
			System.out.println("System Error " + e);
		}
	}
}
