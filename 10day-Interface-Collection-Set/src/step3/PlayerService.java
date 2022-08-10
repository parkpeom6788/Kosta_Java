package step3;

public class PlayerService {
	// 상위 인터페이스 타입 p 매개변수로
	// 다양한 하위 객체를 처리 할 수 있다
	public void proceed(Player p) {
		// CD플레이어의 독자적 멤버에 접근하기 위해 Object down Casting
		if(p instanceof CDPlayer) {
			((CDPlayer) p).insertCd();
		}
		p.play();
	}
}
