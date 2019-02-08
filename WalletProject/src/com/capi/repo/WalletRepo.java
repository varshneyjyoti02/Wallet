package com.capi.repo;

import java.util.List;

import com.capi.beans.Customer;
import com.capi.beans.Wallet;

public interface WalletRepo {
	Customer save(Customer c);
    	List<Customer> findByPhone(String phone);
		

}
