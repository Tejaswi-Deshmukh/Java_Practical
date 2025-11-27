package com.hdfc.core;

public class BankAccount {

		private int accountNumber;
		private double balance;
		private String customer_name;
		private String phone_number;
		
		private static int account=0;
		
		public BankAccount(double balance, String cust_name, String phone_no)
		{
			this.balance=balance;
			this.customer_name=cust_name;
			this.phone_number=phone_no;
			this.accountNumber = ++account;
		}
		
		
		public void deposit(double amount) {
			this.balance += amount;
		}
		
	
		public void withdraw(double amount) throws BankingException{
			if (this.balance < 0){
				System.out.println("You have insufficient Balance!!");
			}
			else {
				this.balance -= amount;
				System.out.println("Withdraw Successfull!!");
			}
		}
		
		
		public String toString() {
			return "Account number="+accountNumber+" Balance="+this.balance+" Customer Number="+this.customer_name+" Phone Number="+this.phone_number;
		}
		
		
		public double getBalance() {
			return this.balance;
		}
		
		public double setBalance(double bal) {
			return this.balance=bal;
		}


		public int getAccountNo() {
			return this.accountNumber;
		}
}
