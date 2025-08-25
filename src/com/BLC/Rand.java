package com.BLC;

import java.util.Scanner;

public class Rand {
	String name;
	String type;
	int price;
	float time;
	String protection;
	
	
	public void setrand()
	{
		System.out.println("Hello Customer!! Choose your choise ?");
		System.out.println("---------------------------------");
		Scanner sc=new Scanner (System.in);	
		System.out.print("Enter the Buget ?[Gavarani:150-5000/Russian:Above 6000]: ");
		price=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Rand name : ");
		name=sc.nextLine();
		
//		System.out.println("Enter the Rand type[Gavarani/Russian] :");
//		type=sc.nextLine();
		
		
		System.out.print("Enter the duration of sex ? :");
		time=Float.parseFloat(sc.nextLine());
		System.out.print("You want use protection [yes/no] :");
		protection=sc.nextLine();
		sc.close();
		
				
	}
	
	public void price()
	{
		if(price>=6000)
		{
//			System.out.println("Your choise is Russian");
			type="Your choise is Russian";
		}
		else
		{
//			System.out.println("Your choise is Gavarani");
			type="Your choise is Gavarani";
			
		}
	}
	public void getrand()
	{
		System.out.println("---------------------------------------------");
		System.out.println("You rand is rady for chudai ");
		System.out.println("Yours Rand Price is : "+price);
		System.out.println("Yours Rand Type is : "+type);
		System.out.println("Yours Rand name is : "+name);
		System.out.println("Yours Rand Duration is : "+time+"min");
		System.out.println("You want to use protection is : "+protection);
	}

}
