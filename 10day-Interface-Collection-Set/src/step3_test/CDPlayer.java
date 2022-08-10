package step3_test;
public class CDPlayer implements Player {
	@Override
	public void play() {
		System.out.println("CD를 재생하다");
	}
	public void insertCd() {
		System.out.println("시디를 넣다");
	}
}
