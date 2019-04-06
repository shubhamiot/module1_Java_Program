package com.payment.bean;

public class Payment {
	private String name;
	private long account_number;
	private long balance;
	private long credit,phoneNumber;
	private long debit;
	public Payment(String name, long account_number, long phoneNumber ,long balance, long credit, long debit) {
		super();
		this.name = name;
		this.account_number = account_number;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.credit = credit;
		this.debit = debit;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long  account_number) {
		this.account_number = account_number;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getCredit() {
		return credit;
	}
	public void setCredit(long credit) {
		this.credit = credit;
	}
	public long getDebit() {
		return debit;
	}
	public void setDebit(long debit) {
		this.debit = debit;
	}

	@Override
	public String toString() {
		return "Payment [name=" + name + ", account_number=" + account_number + ", balance=" + balance + ", credit="
				+ credit + ", phoneNumber=" + phoneNumber + ", debit=" + debit + "]";
	}
}
