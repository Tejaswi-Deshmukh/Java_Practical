package com.hdfc.core;
import java.util.Scanner;

import com.hdfc.core.*;

@SuppressWarnings("unused")
public class SavingAccount extends BankAccount {
	Scanner sc= new Scanner(System.in);
	private static final double INTERESTRATE;

	static {
		INTERESTRATE = 0.10;
	}
	
	public SavingAccount(double balance, String cust_name, String phone_no) {
		super(balance, cust_name, phone_no);
	}
	
	
	
	@Override
	public String toString() {
		return "Saving Account:"+super.toString()+"Interest Rate:"+INTERESTRATE; 
	}
	
	@Override
	public void withdraw(double amount) throws BankingException{
		if (getBalance() < 0){
			throw new BankingException("You have insufficient Balance!!");
		}
		else {
			setBalance(getBalance() - amount);
			System.out.println("Withdraw Successfull!!");
			System.out.println("Your balance after withdraw is"+getBalance());
		}
	}


	
	public void applyInterest(int time_period) {
		double interest = (getBalance()*INTERESTRATE*time_period)/100;
		setBalance(interest + getBalance()); 
	}
	
}
