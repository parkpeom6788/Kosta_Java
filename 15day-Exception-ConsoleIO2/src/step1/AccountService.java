package step1;
public class AccountService {
	public void deposit(int money) throws NoMoneyException {
		try {
			if(money <= 0) 
				throw new NoMoneyException(money + "잘못된 출금액 입니다.");
				System.out.println(money + " 입금완료");
				System.out.println("B");
			} finally {
				System.out.println("카드를 돌려줌");
				System.out.println("C");
			}
	}
}
