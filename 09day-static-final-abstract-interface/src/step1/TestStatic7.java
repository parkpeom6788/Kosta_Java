package step1;

public class TestStatic7 {
	public static void main(String[] args) {
		System.out.println("main 실행"); // 2 
	}
	static {  // main 메서드 보다 static 영역이 먼저 실행 된다. 
		System.out.println("static 초기화 영역"); // 1
	}
}
