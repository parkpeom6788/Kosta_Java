package step3;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import common.Path;

public class ConsoleInputFileOutputService {
	private String filePath = Path.TEST_DIR + "menu.txt";
	public void execute() throws IOException {
		String menu = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(new FileWriter(filePath,true),true); // FileWriter true : append , PrintWriter 에 true를 주면 autoflush ( close 안해도 즉시 출력 ) 
			while (true) {
				System.out.println("점심 메뉴를 입력하세요 : ");
				menu = br.readLine(); // 입력 받음
				if (menu.equalsIgnoreCase("exit")) {
					break;
				}
				pw.print(menu);
				System.out.println(menu + "주문");
			  }
		} finally {
			if(br != null)
				br.close(); // close 할때 flush 한다 
			if(pw != null)
				pw.close();
		}
	}
}
