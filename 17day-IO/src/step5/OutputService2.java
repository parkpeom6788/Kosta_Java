package step5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class OutputService2 {
	private String filePath;
	public OutputService2() {
	}
	public OutputService2(String filePath) {
		this.filePath = filePath;
	}
	/* 콘솔에서 입력스트림 생성 Scanner(System.in)
	    파일에 출력하는 스트림 new PrintWriter(new FileWriter(filePath,true))
	 	scanner.nextLine(); => pw.println()
	    exit 가 입력되면 while break
	    pw close() => 스트림을 닫아주고 flush 즉 버퍼에 있는 데이터를 출력한다
		선수명을 입력하세요 : 손흥민 => 엔터키 누르면 player.txt에 출력
		선수명을 입력하세요 : 서정우 => 엔터키 누르면 서정우가 player.txt에 출력
	 	선수명을 입력하세요 : 김민석 =>
	 	선수명을 입력하세요 : exit => 엔터키 누르면 
	 	선수명단 출력을 완료했습니다 
	 */
	public void writePlayer() throws IOException {
		Scanner scanner = null; // 지역변수는 null로 초기화 해준다
		String player = null;
		PrintWriter pw = null;
		// 처음에 try - finally 구조를 만들고 시작한다.
	try {
			scanner = new Scanner(System.in); // 입력 스트림 
			pw = new PrintWriter(new FileWriter(filePath, true)); // 출력 스트림
			while (true) {
				System.out.print("선수명을 입력하세요 :");
				player = scanner.nextLine();
				if (player.equalsIgnoreCase("exit")) // 대소문자 관계없이 
					break; // while문을 벗어난다.
				else
					pw.println(player);
			  }
		} finally {
		 if(pw != null) // Exception이 나면 null이되므로 닫을필요가 없어짐 
			 pw.close(); // 파일에 기록되는 시점 이다 (버퍼에있는걸 밖에다 배출함)
		 if(scanner != null) 
		 	scanner.close();
		}
	}
}