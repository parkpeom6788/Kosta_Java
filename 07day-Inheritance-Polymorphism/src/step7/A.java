package step7;

public class A {
	protected void a() {
		System.out.println("ㅎㅎ");
	}
	public void run() {
		System.out.println("뛰다");
	}
	public static void main(String[] args) {
		C c = new C();
		c.a(); // ㅂㅂ 
	}
}
class B extends A {
	public void a() {
		System.out.println("ㅂㅂ");
	}
}
class C extends B {
	public void c() {
		super.a();
	}
}