package step2;

import java.io.IOException;

public class TestSerializeAccountService2 {
	public static void main(String[] args) {
		
		AccountService service = new AccountService();
		Account account;
		try {
			account = service.executeDeserialize();
			System.out.println("파일에 저장된 계좌객체를 역직렬화 하여 계좌정보 확인");
			System.out.println("계좌번호:"+account.getAccountNumber());
			System.out.println("계좌주명:"+account.getName());
			System.out.println("잔액:"+account.getBalance());
			System.out.println("비밀번호:"+account.getPassword());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}