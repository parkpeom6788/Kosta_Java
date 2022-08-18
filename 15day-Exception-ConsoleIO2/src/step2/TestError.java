package step2;

class ErrorDemo {
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
