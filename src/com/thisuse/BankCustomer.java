package com.thisuse;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		Bank Saurabh=new Bank();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the name Customer Name :");
		String customerName=sc.nextLine();
		System.out.print("Enter the Account Number" );
		int accountNumber=sc.nextInt();
		System.out.print("Enter the Current Balance " );
		double currentBalance=sc.nextDouble();
		System.out.println("Enter Your amount[withdraw/deposit]");
		double amount=sc.nextDouble();
		
		
		Saurabh.setCustomerDeatils(customerName, accountNumber, currentBalance);
		System.out.println("enter your choice ::  1:: withdraw  2:: diposite");
		int choice=sc.nextInt();
		if(choice==1) {
			
			Saurabh.withdraw(amount);
		}
		else if(choice==2) {
			Saurabh.deposit(amount);
		}
	
		Saurabh.currentBalance();
		Saurabh.displayDetails();
		
	}

}
