package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;

public interface WalletService {
	public Customer createAccount(String name,String mobileNumber,BigDecimal amount);
	public Customer showBalance(String mobileNumber);
	public Customer fundTransfer(String sourceMobileNumber,String targetMobileNumber,BigDecimal amount);
	public Customer depositAmount(String mobileNumber,BigDecimal amount);
	public Customer withdrawAmount(String mobileNumber,BigDecimal amount);
	
	
	
}
