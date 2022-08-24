package step5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
public class OutputService2 {
	String filePath;
	public OutputService2() {
	}
	public OutputService2(String filePath) {
		this.filePath = filePath;
	}
	public void writePlayer() throws IOException {
		Scanner scanner = new Scanner(System.in);
		FileWriter fw = null;
		PrintWriter pw = null;
		String name = null;
		try {
			pw = new PrintWriter(new FileWriter(filePath,true));
		while(true) {
			System.out.print("선수명을 입력하세요 : ");
			name = scanner.nextLine();
			if(name.equalsIgnoreCase("exit")) {
				break;
			} else {
				pw.println(name);
				}
			}
		} finally {
			if(fw != null)
				fw.close();
			if(pw != null)
				pw.close();
			scanner.close();
		}
	}
}
