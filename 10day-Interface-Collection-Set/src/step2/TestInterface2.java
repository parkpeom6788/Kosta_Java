package step2;

public class TestInterface2 {
	public static void main(String[] args) {
		FlyerService service = new FlyerService();
		service.execute(new Airplane());
		service.execute(new Bird());
		service.execute(new SuperMan());
		/*
		 * 비행기가 날다
		 *	새가 날다
		 *	슈퍼맨이 날다
		 */
	}
}
