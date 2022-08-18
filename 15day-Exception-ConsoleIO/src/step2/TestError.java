package step2;
/*
 * Throwable 의 자식 클래스
 *  Error 와 Exception
 *  Error : 심각한 문제 , 환경 또는 구조를 개선
 *  Exception : 예외 , 프로그램 내부에서 처리
 */
class ErrorDemo {
	// 무한반복... stack 차올라서 stackoverflow 발생
	public void a(int i) {
		System.out.println(i);
		b(i);
	}
	public void b(int j) {
		System.out.println(j);
		a(j);
	}
}	
public class TestError {
	public static void main(String[] args) {
		ErrorDemo demo = new ErrorDemo();
		demo.a(7);
	}
}
