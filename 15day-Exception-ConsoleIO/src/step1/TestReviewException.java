package step1;
public class TestReviewException {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		int money = 100; // 정상흐름 B->C->D->F
		money = 0; // 예외흐름  A->C->E->F
	try {
			service.deposit(money); // 컴파일 시 체크해 준다고 CheckedException
			System.out.println("D"); // 입금 후 후속작업
		} catch (NoMoneyException e) {
			//예외 발생시 처리 내용 : 메세지 반환받아 출력
			System.out.println(e.getMessage()); // super(message)
			System.out.println("E");
		}
	System.out.println("F");
	}
}
