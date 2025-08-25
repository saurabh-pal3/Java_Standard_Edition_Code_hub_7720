package com.BLC;

 public class TwoDigitsDifference {

	public static int getDiffOfDigits (int x)//x=66
	
	{
		int last=x%10;//6
		int first=x/10;//6
	   
		return first-last;

	}

}
