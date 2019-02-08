package com.capgemini.view;

import java.math.BigDecimal;

import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

public class WalletMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WalletService walletService = new WalletServiceImpl();
		
		
		walletService.createAccount("Ravi", "1",new BigDecimal("10000.0"));
		walletService.createAccount("piliwali", "2",new BigDecimal("50000"));
		
		System.out.println(walletService.showBalance("1").getWallet().getBalance());
		System.out.println(walletService.showBalance("2").getWallet().getBalance());
		
		walletService.depositAmount("1",new BigDecimal("30000"));
		walletService.depositAmount("2",new BigDecimal("40000"));
		
		System.out.println(walletService.showBalance("1").getWallet().getBalance());
		System.out.println(walletService.showBalance("2").getWallet().getBalance());
		
		walletService.withdrawAmount("1",new BigDecimal("20000"));
		walletService.withdrawAmount("2",new BigDecimal("20000"));

		System.out.println(walletService.showBalance("1").getWallet().getBalance());
		System.out.println(walletService.showBalance("2").getWallet().getBalance());
		
		walletService.fundTransfer("1", "2",new BigDecimal("20000"));
		
		System.out.println(walletService.showBalance("1").getWallet().getBalance());
		System.out.println(walletService.showBalance("2").getWallet().getBalance());
		
		
		
	}

}
