package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable {
	private Socket socket;
	String name = null;
	
	public ServerWorker(Socket socket) {
		this.socket = socket;
		name = socket.getInetAddress().toString();
	}
	@Override
	public void run() {
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void echo() throws IOException {
	try {	
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter  pw = new PrintWriter(socket.getOutputStream(), true);
		System.out.println(name + " 님이 입장했습니다.");

		while (true) {
			String message = br.readLine();
			System.out.println(name + " > " + message);
			pw.println(name + " > " + message);
			if(message.equalsIgnoreCase("exit")|| message == null) {
				socket.close();
				System.out.println(name + " 님이 퇴장하였습니다.");
				break;
			}
		}
	} finally {
		if(socket.isClosed() == false)
			socket.close();
		}
	}
}
