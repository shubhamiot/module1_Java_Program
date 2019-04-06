package com.payment.service;
import java.util.Map;
import com.payment.bean.Payment;
public interface ServiceInterface {
	//boolean validateUserName(String userName);
	public void storeIntoMap(Payment payment);
	//public abstract
	Map<Long,Payment> displayDaoPayment();
}
