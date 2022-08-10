package step3_test;

public class PlayerService {
	
	public void proceed(Player p) {		
		if(p instanceof CDPlayer) {
			((CDPlayer)p).insertCd();
		}
		p.play();
	}
}
