package com.Throwable_methode;

public class Demo1 {

	public static void main(String[] args)
	{
		System.out.println("Main Methode started !!");
		
		try
		{
			throw new NullPointerException("Ram Ram Error Ala re !!");
		}
		catch(Exception e)
		{
			System.out.println("Referance is null !!");
			
			System.out.println("........................");
			
			System.out.println(e.getMessage());
			System.out.println("........................");
			
			System.out.println(e.toString());
			System.out.println("........................");
			
			e.printStackTrace();
			
		}
		

	}

}
