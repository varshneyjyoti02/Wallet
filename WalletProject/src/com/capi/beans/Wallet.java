package com.capi.beans;

import java.math.BigDecimal;

public class Wallet {
	
	private int id;
	private BigDecimal balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
		public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}
		@Override
	public String toString() {
		return "Wallet [id=" + id + ", balance=" + balance + "]";
	} 

}
