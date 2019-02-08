package com.capi.service;

import java.math.BigDecimal;
import java.util.List;

import com.capi.beans.Customer;

public interface WalletService {
	
	Customer createAccount(String name,String phone,BigDecimal amt);
	List<Customer> showBalance(String phone);

}
