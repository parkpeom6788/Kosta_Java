package step6_test;

public class TestForLoop {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("***********");
		// 10 9 8 7 ... 1
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
}
