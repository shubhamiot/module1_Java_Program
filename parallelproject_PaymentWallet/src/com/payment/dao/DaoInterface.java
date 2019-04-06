package com.payment.dao;

import java.util.Map;

import com.payment.bean.Payment;

public interface DaoInterface {
	public void storeIntoMap(Payment pay);
	//public static Map<Long, Payment> displayDaoPayment();

}
