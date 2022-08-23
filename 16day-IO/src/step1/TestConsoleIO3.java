package step1;
import java.util.Scanner;
public class TestConsoleIO3 {
	private Scanner scanner = new Scanner(System.in); // 인스턴스변수로 올려줘야 지역변수에서 쓸수있음
	 /*
	 * 15day project의 if기반의 TestConsoleIO2 를 Switch 구문으로 변경해보는 예제
	 * 제어문에서 label를 사용해본다
	 */
	public void showMenu() { // 레이블 (이름은 자유롭게 지정 할 수 있음),아래 while문을 종료하고 (벗어나고) 싶을때 break 레이블명을 써주면 된다.
	EXIT : while(true) {
			System.out.println("주종을 선택하세요 1. 맥주 2. 소주 3. 막걸리 4. 종료");
			String info = scanner.nextLine();
			switch(info) {
			case "1": System.out.println("맥주를 선택하셨습니다."); break;
			case "2": System.out.println("소주를 선택하셨습니다."); break;
			case "3": System.out.println("막걸리를 선택하셨습니다."); break;
			case "4":
				System.out.println("주문프로그램을 종료합니다.");
				break EXIT; // break; // switch 문을 벗어난다 (while문이 아니라) ==> label 을 이용해 특정 제어문을 벗어나도록 한다
									 // 지정한 레이블이 명시된 제어문을 벗어난다 
			default : System.out.println("잘못된 입력값 입니다 (1~4까지만 가능)");
			}
		}
	scanner.close();
	}
	public static void main(String[] args) {
		new TestConsoleIO3().showMenu();
	}
}
