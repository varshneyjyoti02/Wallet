package com.capi.service;

import java.math.BigDecimal;
import java.util.List;

import com.capi.beans.Customer;
import com.capi.repo.WalletRepo;

public class WalletServiceImpl implements WalletService {
	WalletRepo walletRepo;

	public WalletServiceImpl(WalletRepo walletRepo) {
		super();
		this.walletRepo = walletRepo;
	}

	@Override
	public Customer createAccount(String name, String phone, BigDecimal amt) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setName(name);
		customer.setPhone(phone);
		//customer.setWallet(wallet);
		
		return walletRepo.save(customer);
	}

	@Override
	public List<Customer> showBalance(String phone) {
		// TODO Auto-generated method stub
		return walletRepo.findByPhone(phone);
	}

}
