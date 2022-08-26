package step2;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = -2566446155356415019L;
	private long accountNumber;
	private String name;
	private long balance;
	// transient keyword : 직렬화 대상에서 제외
	private transient String password;
	
	public Account(long accountNumber, String name, long balance, String password) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", password="
				+ password + "]";
	}
}
