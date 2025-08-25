package com.thisuse;

public class Bank {
	
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	static String bankName;
	static String bankAddress;
	static String bankIFSCCod;
	
	
	public void setCustomerDeatils(String name, int accNumber,double balance)
	{
		customerName=name;
		accountNumber=accNumber;
		currentBalance=balance;
		
	}
	public void withdraw( double amount)
	{
		if(amount>currentBalance)
		{
			System.err.println("You have insufficient balance");
		}else {
			currentBalance-=amount;
			System.out.println("Your Amount is Deposite thank you ");
		}
		
	}
	public void deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println("Please Enter the Valied Amount in POssitive");
		}
		else {
			currentBalance+=amount;
			System.out.println("Amount is Deposited Sucessfully...\n Updated Available Balance :"+currentBalance);
			
		}
		
	}
	public void currentBalance()
	{
		System.out.println(currentBalance);
	}
	
	public String displayDetails()
	{
		return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
	}
	

}
