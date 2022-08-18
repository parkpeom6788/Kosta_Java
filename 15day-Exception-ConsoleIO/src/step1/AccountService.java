package step1;
public class AccountService {
	public void deposit(int money) throws NoMoneyException {
	try {
		if(money <= 0) 
			throw new NoMoneyException(money + "잘못된 출금액 입니다."); // 나를 호출한쪽으로 throws 함 
			System.out.println(money +" 입금 완료");
			System.out.println("B");
		} finally { // finally 는 반드시  try 랑 같이 써야 함
			System.out.println("카드를 돌려줌"); // 마지막에 꼭 실행해줘야 한다. 
			System.out.println("C");
		}
	}
}
