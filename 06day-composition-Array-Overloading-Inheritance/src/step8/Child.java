package step8;
public class Child extends Parent  {
	public void play() {
		// 부모라도 클래스가 다르므로 private member에 접근 불가 error 
		// System.out.println(money + "원으로  놀다");
		// 상속받은 getter / setter 로 접근하면 된다.
		System.out.println(getMoney() + "원으로 놀다");
	}
}
