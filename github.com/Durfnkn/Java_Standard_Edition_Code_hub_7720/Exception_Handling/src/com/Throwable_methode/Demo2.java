package com.Throwable_methode;

public class Demo2 {

	public static void main(String[] args)
	{
		System.out.println("Main Methode started !!");
		
		try
		{
			String str = null;
			System.out.println(str.toUpperCase());
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
