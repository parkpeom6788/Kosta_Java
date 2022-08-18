package step3;


public class TestFinally {
	public static void main(String[] args) {
		String age = "스몰";
		try {
			int iage = Integer.parseInt(age);  // NumberFormatException
			System.out.println(iage+1);
		} catch(NullPointerException ne) {
			System.out.println("null 이므로 출력 불가");
		} finally {
			System.out.println("finally 영역 : 예외 발생 및 처리여부와 관계없이 항상 실행");
		}
		System.out.println("test");
		System.out.println("정상 수행"); // 정상수행 안나옴 
	}
}
