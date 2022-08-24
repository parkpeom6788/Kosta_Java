package step3;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import common.Path;
public class ConsoleInputFileOutputService {
	private String filePath=Path.TEST_DIR+"menu.txt";
	public void execute() throws IOException {
		String menu = null;
		BufferedReader br = null;
		PrintWriter pw =null;
try {		
	br = new BufferedReader(new InputStreamReader(System.in));
	//FileWriter true : append , PrintWriter true : autoflush 즉시 출력 (메모장 즉시변경)
	pw = new PrintWriter(new FileWriter(filePath,true),true);
	while(true) {
		System.out.print("점심 메뉴를 입력하세요 : ");
		menu = br.readLine();
		if(menu.equalsIgnoreCase("exit")) {
			break;
		} else {
			pw.println(menu);
			System.out.println(menu + "주문");
			}
		}
	} finally {
		if(br != null)
			br.close(); // close 할때 flush 한다. 
		if(pw != null)
			pw.close();
		}
	}
}
