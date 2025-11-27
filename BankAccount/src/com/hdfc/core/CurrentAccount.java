package com.hdfc.core;
//import com.hdfc.core.*;

public class CurrentAccount extends BankAccount{
	private double overdraftLimit;

	public CurrentAccount(double balance, String cust_name, String phone_no, double overdraftLimit) {
		super(balance, cust_name, phone_no);
		this.overdraftLimit = overdraftLimit;
	}

	
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	@Override
	public String toString() {
		return "Current Account:"+super.toString()+"Overdraft Limit:"+this.overdraftLimit;
	}

	
	@Override
	public void withdraw(double amount) throws BankingException{
		
		if (overdraftLimit + getBalance() < amount) {
			throw new BankingException("Overdrafting Limit Exceeded");
		} 
		
		else if ((overdraftLimit + getBalance() >= amount) && (getBalance() <= amount)) {
//			double overdraftUsed = amount - getBalance();
//			setOverdraftLimit(overdraftLimit - overdraftUsed);
			setOverdraftLimit((getBalance()+overdraftLimit )-amount);
			setBalance(0);
			System.out.println("Overdaft Limit is:"+getOverdraftLimit());
		}
		
		else{
			setOverdraftLimit(overdraftLimit);
			setBalance(getBalance() - amount);
			
			System.out.println("Overdaft Limit is:"+getOverdraftLimit());
		}
	}
}
