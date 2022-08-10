package step3;
public class TestInterface3 {
	public static void main(String[] args) {
		PlayerService service = new PlayerService();
		service.proceed(new GomPlayer());
		service.proceed(new Youtube());
		service.proceed(new CDPlayer());
		/*
		 * 곰플레이어 재생하다
		 * 유튜브 재생하다
		 * 시디를 넣다
		 * 시디 재생하다
		 */
	}
}
