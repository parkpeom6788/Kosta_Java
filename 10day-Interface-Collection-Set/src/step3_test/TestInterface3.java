package step3_test;

public class TestInterface3 {
	
	public static void main(String[] args) {
		PlayerService service = new PlayerService();
		service.proceed(new GomPlayer());
		service.proceed(new Youtube());
		service.proceed(new CDPlayer());
		
	}
}
