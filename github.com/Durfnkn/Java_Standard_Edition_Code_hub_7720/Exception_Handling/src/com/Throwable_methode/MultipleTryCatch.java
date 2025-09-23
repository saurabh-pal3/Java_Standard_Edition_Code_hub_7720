package com.Throwable_methode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
			Scanner sc=new Scanner (System.in);
		
			System.out.println("Enter your salary");
			double sal = sc.nextDouble();
			
			System.out.println("your sal is :" +sal);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input is not in a valied format");
		}
		
		try
		{
			int size = -9;
			int []arr= new int[size];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array size must be a positive interger !!");
		}
		System.out.println("The main methode is ended!!");
		
	}
	

}
