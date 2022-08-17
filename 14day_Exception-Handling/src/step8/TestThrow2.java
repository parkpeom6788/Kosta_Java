package step8;

public class TestThrow2 {
	
	public static void main(String[] args) {
		MovieService service = new MovieService();
		int age = -1; // 잘못된 나이 정보  예외
		age = 13; // 13세 미성년 예외 
	//	age = 20; // 20세 이상 정상 
		try {
			service.enterAdultMovie(age);
		} catch (AgeException e) {
			System.out.println(e.getMessage()); // "나이 정보를 다시 확인하세요."
		}
		System.out.println("정상수행");
	}
}
