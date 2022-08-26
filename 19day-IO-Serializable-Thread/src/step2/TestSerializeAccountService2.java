package step2;

import java.io.FileNotFoundException;
import java.io.IOException;
public class TestSerializeAccountService2 {
	public static void main(String[] args) {
		AccountService service = new AccountService();
	//try
		Account account;
		try {
			account = service.executeDeSerialize();
			System.out.println("파일에 저장된 계좌객체를 역직렬화 하여 계좌정보를 확인");
			System.out.println("계좌번호:"+account.getAccountNumber());  // 1
			System.out.println("계좌주명:"+account.getName()); // 아이유
			System.out.println("잔액:"+account.getBalance()); // 100
			System.out.println("비밀번호:"+account.getPassword()); // null
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// catch
	}
}