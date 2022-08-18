package step9;

public class TestThrow3 {
	public static void main(String[] args) {
		int birthDay = 5; // 정상흐름
			birthDay = 0; // 예외흐름
			birthDay = 32; // 예외흐름
		try {
			MyDate date = new MyDate(birthDay);
			System.out.println(date.getBirthDay());
		} catch (DayException e) {
			System.out.println(e.getMessage());
		}
	}
}
