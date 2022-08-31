package step5.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  1 대 1 지속적 통신
 *  클라이언트 접속해서 메세지를 보내면 
 *  입력받아 자신의 화면에 출력하고 
 *  다시 그 메세지를 클라이언트에 출력하는 역할을 지속한다
 *  클라이언트가 exit 라는 문자열을 전송하면
 *  종료 메세지를 받아들여 서버는 종료한다
 *  while문 안에 accept 있으면 안됨 행위만 반복
 *  필요한 stream은 한번만 생성
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			server = new ServerSocket(5432);
			System.out.println("**EchoServer 실행중**");
			Socket s = server.accept(); // while문 안에 accept 있으면 안됨 행위만 반복
			String name = s.getInetAddress().toString();
			System.out.println(name + "님이 입장했습니다." );
			
			// 필요한 stream은 한번만 생성
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
			while (true) {
				String received;
				received = br.readLine();  // 클라이언트 접속해서 메세지를 보내면 
				System.out.println(name + "님의 메세지  : " + received); // 입력받아 자신의 화면에 출력하고
				if(received == null || received.equalsIgnoreCase("exit")) { // 클라이언트가 exit 라는 문자열을 전송하면
					if(server != null)
						s.close();
					System.out.println(name + "님이 나갔습니다."); // 종료 메세지를 받아들여 서버는 종료한다
					System.out.println("**EchoServer 종료**");
					break;
				}
				pw.println("Client 에서 입력받은 메세지 : " + received  + "*server");  //  다시 그 메세지를 클라이언트에 출력하는 역할을 지속한다
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
