package step1;

public class Person extends Animal {
	
	@Override // 어노테이션 : 오버라이드 문법 체크 
	public void eat() {
		System.out.println("잡식하다");
	}
}
