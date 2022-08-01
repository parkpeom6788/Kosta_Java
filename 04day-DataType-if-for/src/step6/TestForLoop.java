package step6;

public class TestForLoop {
	public static void main(String[] args) {
		// for loop(반복문) : 일정한 수를 반복할 때 주로 사용 
		for(int i=0; i<10; i++) { // i++는 실행후 증가
			System.out.println(i);
		}
		System.out.println("**********");
		// 10  9  8  7 ~~~~~ 1
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
	}
}
