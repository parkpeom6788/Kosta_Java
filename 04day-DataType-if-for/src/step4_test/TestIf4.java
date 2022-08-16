package step4_test;

import step4.Account;

public class TestIf4 {
	public static void main(String[] args) {
		Account a = new Account();
		if(a.getBalance() != 0) {
			System.out.println(a.getBalance()); // 0
		}
		a.deposit(100);
		a.deposit(200);
		System.out.println(a.getBalance());
		a.deposit(-1); // -1 들어가면 else 문으로 빠짐 
		System.out.println(a.getBalance());
	}
}
