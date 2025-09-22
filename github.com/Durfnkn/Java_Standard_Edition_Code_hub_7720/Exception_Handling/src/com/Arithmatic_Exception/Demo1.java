package com.Arithmatic_Exception;

import java.util.Scanner;

public class Demo1 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
		System.out.print("Enter the x value :");
		int x =sc.nextInt();
		System.out.print("Enter the y value :");
		int y = sc.nextInt();
		
		int result = x/y;
		System.out.println("The result is :"+result);
		System.out.println("Inside the try block !!");
		
		}
		catch(Exception e)
		{
			System.out.println("Inside the catch block");
			System.err.println(e);
		}
		System.out.println("Thank you !!");
		sc.close();
		
		
	}

}
