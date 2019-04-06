package com.payment.service;
import java.util.Map;
import com.payment.bean.Payment;
import com.payment.dao.DaoClass;

public class ServiceClass implements ServiceInterface {
	DaoClass dao = new DaoClass();

	public void storeIntoMap(Payment payment) {
		dao.storeIntoMap(payment);
	}
	public Map<Long, Payment> displayDaoPayment() {
		// TODO Auto-generated method stub
		return dao.displayDaoPayment();
	}

	public double CheckBalance(long checkVal) {
		return dao.CheckBalance(checkVal);
	}

	public String WithdrawMoney(long checkVal) {
		return dao.WithdrawMoney(checkVal);
	}

	public String SendFunds(long sender, long receiver) {
		return dao.SendFunds(sender, receiver);
	}

	public String CreditAmount(long cred) {
		return dao.CreditAmount(cred);

	}

}
