package com.payment.ui;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import com.payment.dao.DaoClass;
import com.payment.dao.DaoInterface;
import com.payment.bean.Payment;
import com.payment.service.ServiceClass;
import com.payment.service.ServiceInterface;

public class Main {
	String name;
	static long account = 10;// checkAcc;
	long credit, phoneNumber;
	long debit;
	long balance;
	long checkAcc;
	Payment pay;
	DaoClass dao = new DaoClass();
	ServiceClass service = new ServiceClass();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Main mp = new Main();

		// int c = 1;
		while (true) {
			System.out.println(
					"********************************************************************************BANKING SYSTEM*************************************************************************");
			System.out.println("		1   . create account");
			System.out.println("		2  .  check balance");
			System.out.println("		3   . credit");
			System.out.println("		4   . display");
			System.out.println("		5   . debit");
			System.out.println("		6   . fund transfer");
			int option = scan.nextInt();

			// c = option;1

			switch (option) {
			case 1:
				mp.CreateAccount();
				break;
			case 2:

				mp.sendInputTobalance();
				break;

			case 3:
				mp.sendInputToCredit();
				break;

			case 4:
				mp.displayData();
				break;
			case 5:
				mp.withdrawCash();
				break;
			case 6:
				mp.fundTransfer();
			}
		}

	}

	void CreateAccount() {

		System.out.println("enter account holder name");

		name = scan.next();
		System.out.println("enter account holder phone number");
		phoneNumber = scan.nextLong();

		// System.out.println("enter account number ");
		// account = scan.nextLong();
		Payment pay = new Payment(name, account++, phoneNumber, balance, credit, debit);
		System.out.println("Congratulations your account number is = " + pay.getAccount_number());
		// pay.setAccount_number(account);
		// pay.setName(name);
		service.storeIntoMap(pay);
		// System.out.println(service.displayDaoPayment());
	}

	void sendInputTobalance() {
		System.out.println("enter account number to show balance");
		checkAcc = scan.nextLong();
		System.out.println(service.CheckBalance(checkAcc));
	}

	void sendInputToCredit() {
		System.out.println("enter account number to credit money");
		long creditVal = scan.nextLong();
		System.out.println(service.CreditAmount(creditVal));
	}

	void withdrawCash() {
		System.out.println("enter account number to debit money");
		long creditVal = scan.nextLong();
		System.out.println(service.WithdrawMoney(creditVal));
	}

	void fundTransfer() {
		System.out.println("enter senders account number");
		long sender = scan.nextLong();
		System.out.println("enter receiver account number");
		long receiver = scan.nextLong();
		System.out.println(service.SendFunds(sender, receiver));
	}

	void displayData() {

		System.out.println(service.displayDaoPayment());
	}
}
