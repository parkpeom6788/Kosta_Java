package step2;

import java.io.IOException;

public class TestSerializeAccountService {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		Account account = new Account(1,"아이유",100,"javaking");
		//try
		try {
			service.executeSerialize(account);
			System.out.println("계좌 객체 직렬화 하여 파일에 저장");
		// catch
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}