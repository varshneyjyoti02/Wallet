package com.capi.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capi.beans.Customer;
import com.capi.beans.Wallet;

public class WalletRepoImpl implements WalletRepo {
	HashMap<Integer,Customer> hm=new HashMap<>();

	@Override
	public Customer save(Customer c) {
		// TODO Auto-generated method stub
		hm.put(c.getId(),c);
		
		return c;
	}

	@Override
	public List<Customer> findByPhone(String phone) {
		// TODO Auto-generated method stub
		List<Customer> list=new ArrayList<>();
		for(Map.Entry<Integer, Customer> cm:hm.entrySet())
		{
			if(cm.getValue().getPhone().equals(phone))
			{
				list.add(cm.getValue());
			}
		}
		return list;
	}

	

}
