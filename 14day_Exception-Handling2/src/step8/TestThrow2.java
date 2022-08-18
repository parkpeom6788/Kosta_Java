package step8;

public class TestThrow2 {
	
	public static void main(String[] args) {
	
		MovieService service = new MovieService();
		int age = -1;
		age = 13;
//		age = 20
		try {
			service.enterAdultMovie(age);
		} catch(AgeException e) {
			System.out.println(e.getMessage()); // 나이 정보를 다시 확인 하세요.
		}
		System.out.println("정상 수행");
	}
}
