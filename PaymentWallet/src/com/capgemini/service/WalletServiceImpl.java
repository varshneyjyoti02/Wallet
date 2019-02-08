package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.repository.WalletRepo;
import com.capgemini.repository.WalletRepoImpl;

public class WalletServiceImpl implements WalletService {
	
	WalletRepo walletRepo = new WalletRepoImpl();
	

	@Override
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Wallet wallet= new Wallet(amount);
		Customer customer=new Customer(name,mobileNumber,wallet);
		walletRepo.save(customer);
		return customer;
	}

	@Override
	public Customer showBalance(String mobileNumber) {
		// TODO Auto-generated method stub
		return walletRepo.findOne(mobileNumber);
	}

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, BigDecimal amount) {
		
		this.depositAmount(targetMobileNumber, amount);
		this.withdrawAmount(sourceMobileNumber, amount);
//		
//		Wallet sourceWallet=sourceCustomer.getWallet();
//		sourceWallet.setBalance(sourceWallet.getBalance().su(amount));
//		sourceCustomer.setWallet(sourceWallet);
//		return sourceCustomer;
//		
//		Customer sourceCustomer=walletRepo.findOne(sourceMobileNumber);
//		Wallet sourceWallet=sourceCustomer.getWallet();
//		sourceWallet.setBalance(sourceWallet.getBalance().add(amount));
//		sourceCustomer.setWallet(sourceWallet);
//		return sourceCustomer;
//		
		
		
		return walletRepo.findOne(sourceMobileNumber);
	}

	@Override
	public Customer depositAmount(String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=walletRepo.findOne(mobileNumber);
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().add(amount));
		customer.setWallet(wallet);
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=walletRepo.findOne(mobileNumber);
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().subtract(amount));
		customer.setWallet(wallet);
		return customer;
	}

}
