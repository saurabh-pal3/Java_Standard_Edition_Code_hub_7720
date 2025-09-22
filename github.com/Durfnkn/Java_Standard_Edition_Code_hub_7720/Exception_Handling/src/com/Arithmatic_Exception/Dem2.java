package com.Arithmatic_Exception;

public class Dem2
{
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException("Hellow saurabh pal");
			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		System.out.println("Thank you!!");
	}

}
