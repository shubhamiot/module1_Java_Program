package com.payment.dao;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.payment.bean.Payment;
public class DaoClass implements DaoInterface {
	private static  Map<Long,Payment> pay=new HashMap<Long, Payment>();
	static long key;
	public void storeIntoMap(Payment payment) {
	key = payment.getAccount_number();
		pay.put(key, payment);
		//i++;
		//System.out.println(pay);
	}	
	public static Map<Long, Payment> displayDaoPayment(){
		return pay;		
	}
	public double CheckBalance(long checkVal)
	{   		
		//System.out.println("enter your account number");
	System.out.print("balance of +"+ pay.get(checkVal).getName() +" is ="  );
		return pay.get(checkVal).getBalance();
		//System.out.println(pay.getBalance());				
	}
	public boolean accountSearch (long checkVal)
	{
		for(long key : pay.keySet())
		{
			if(checkVal == key)
			{
				return true;
			}
		}
		return false;
	}

	public String CreditAmount(long cred)
	{
		System.out.println("enter the amount you want to credit into "+ pay.get(cred).getName() + "'s account" );
		Scanner scan = new Scanner(System.in);
		long credit = scan.nextLong();
		long amount = pay.get(cred).getBalance()+credit;
		pay.get(cred).setBalance(amount);
		return ("balance after adding "+ credit+" amount to "+pay.get(cred).getName()+" account is"+pay.get(cred).getBalance());
	}
	public String WithdrawMoney(long checkval)
	{  
		System.out.println("enter the amount you want to debit from "+pay.get(checkval).getName()+"'s account");
		Scanner scan = new Scanner(System.in);
		long debit = scan.nextLong();
		String str = "";
		if(debit<pay.get(checkval).getBalance())
		{
		long amount = pay.get(checkval).getBalance()-debit;
		pay.get(checkval).setBalance(amount);
		//str =  pay.get(checkval).getBalance() + pay.get(checkval).getName();
	
		str = "balance after deduction for "+pay.get(checkval).getName()+" is "+pay.get(checkval).getBalance();
		return str;
		}
		else
		{
			System.out.println("you dont have enough balance");
		}
		return str;
	}
	public String SendFunds(long sender,long receiver)
	{
		 	System.out.println("enter the amount you want to transfer from  "+pay.get(sender).getName()+"'s account to " +pay.get(receiver).getName()+"'s account" );
		 	Scanner scan = new Scanner(System.in);
			long transfer = scan.nextLong();
			if(transfer<pay.get(sender).getBalance())
			{
			long senderfund = pay.get(sender).getBalance()-transfer;
			long receiverfund = pay.get(receiver).getBalance()+transfer;
			pay.get(sender).setBalance(senderfund);
			pay.get(receiver).setBalance(receiverfund);
//			return ("balance after deduction from "+pay.get(sender).getName()+" is "+pay.get(sender).getBalance())
//			+("balance after addition for "+pay.get(receiver).getName()+" is "+pay.get(receiver).getBalance());
			}
			else
			{
				System.out.println("you dont have enough balance");
			}
			return ("balance after deduction from "+pay.get(sender).getName()+" is "+pay.get(sender).getBalance())
					+("balance after addition for "+pay.get(receiver).getName()+" is "+pay.get(receiver).getBalance());
			//return (senderfund,receiverfund);
	}
}
