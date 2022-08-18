package step1;

public class TestReviewException {
	public static void main(String[] args) {
	AccountService service = new AccountService();
	int money = 100;
	money = 0;
	try {
			service.deposit(money);
			System.out.println("D");
		} catch(NoMoneyException  e) {
			System.out.println(e.getMessage());
			System.out.println("E");
		}
		System.out.println("F");
	}
}
