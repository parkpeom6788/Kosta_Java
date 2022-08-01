package Step5;
import java.util.Scanner;
public class TestSwitch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		int grade = sc.nextInt();
		// switch case 조건문은 상위 case 가 실행되면 아래의 case 가 모두 실행된다.
		// 해당 case 만 실행되게 하려면 break 가 필요하다 : TestSwitch2에서 확인 		
		switch(grade) {
		case 1: System.out.println("하버드");
		case 2: System.out.println("컬럼비아");
		case 3: System.out.println("미시건");
		default:
			System.out.println("하와이");
		}
		sc.close();
	}
}
