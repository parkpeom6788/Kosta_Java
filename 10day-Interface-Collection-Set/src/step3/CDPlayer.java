package step3;
public class CDPlayer implements Player {
	@Override
	public void play() {
		System.out.println("시디를 재생하다");
	}
	// 하위 클래스의 독자적인 메서드
	public void insertCd() {
		System.out.println("시디를 넣다");
	}
}
