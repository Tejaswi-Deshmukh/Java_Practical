package com.hdfc.tester;

import java.util.Scanner;

import com.hdfc.core.*;

public class TestBanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		BankAccount[] accounts = { new SavingAccount(5000, "Atul", "Shastri"),
				new CurrentAccount(7000, "Priyanka", "Joshi", 500) };

		for (BankAccount ba : accounts) {
			System.out.println(ba);

			System.out.println("Enter the amount to be deposited:");
			ba.deposit(sc.nextDouble());
			System.out.println(ba.getBalance());

			if (ba instanceof SavingAccount) {
				
				System.out.println("Enter the amount to be withdraw:");
				((SavingAccount) ba).withdraw(sc.nextDouble());
				System.out.println("Its a saving account,therefore applying Interest!!");
				((SavingAccount) ba).applyInterest(1);
				System.out.println("Balance in saving account after applying:" + ba.getBalance());
			}
			

			else if (ba instanceof CurrentAccount) {
				
					System.out.println("Enter the amount to be withdraw:");
//					ba.withdraw(sc.nextDouble());
//					System.out.println(ba.getBalance());
					((CurrentAccount) ba).withdraw(sc.nextDouble());
					System.out.println("Balance in current account after overdrafting:" + ba.getBalance());
				}
			}
		}
		
		catch (Exception e) {
					System.out.println(e);
				}	
		
	}
}
