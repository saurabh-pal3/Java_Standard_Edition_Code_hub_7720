package com.copyConstractor;

import java.util.Scanner;

public class ApplicaleCreaditCrad {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer Name:");
		String customerName=sc.nextLine();
		
		System.out.println("Enter the credit point:");
		int creditPoint=Integer.parseInt(sc.nextLine());
		
		Customer customer=new Customer(customerName, creditPoint);
		
		CardType offerCard=CardOnOffer.getOfferedCard(customer);
		System.out.println(offerCard);
		sc.close();
		

	}

}
