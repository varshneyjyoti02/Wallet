package com.capi.view;

import java.util.List;

import com.capi.beans.Customer;
import com.capi.beans.Wallet;
import com.capi.repo.WalletRepo;
import com.capi.repo.WalletRepoImpl;
import com.capi.service.WalletService;
import com.capi.service.WalletServiceImpl;

public class Main {
	public static void main(String[] args)
	{
		WalletRepo wr=new WalletRepoImpl();
		WalletService ws=new WalletServiceImpl(wr);
		Wallet wallet=new Wallet();
		Customer c=new Customer();
		c.setName("Jyoti");
		c.setPhone("78676686");
		c.setId(1);
		c.setWallet(wallet);
		wallet.setBalance(null);
		wallet.setId(5);
		
		wr.save(c);
		List<Customer> list=wr.findByPhone("89955993");

			for(Customer cm:list)
			{
				System.out.println(cm);
			}
				
			
	}

}
