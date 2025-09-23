package com.Real_time_use;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Wellcome to my application !!!");
		
		System.out.println("Enter the  x value :");
		int x = sc.nextInt();
		
		System.out.println("Enter the  y value :");
		int y = sc.nextInt();
		
		int result = x/y;
		
		System.out.println("The result is :"+result);
		}
		catch(Exception e)
		{
			System.err.println("Don't put zero here");
		}
		System.out.println("Thank you for visisting !!");
		sc.close();
		
	}
	

}
