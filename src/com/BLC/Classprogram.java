package com.BLC;

public class Classprogram {

	public static int numberIsEvenObb (int n)
	{
		if(n<=0)
		{
			return -1;
		}
		else if(n%2==0)
		{
			return n*n;
		}
		else if(n%2==1)
		{
			return n*n*n;
		}
		else
		{
			return -1;
		}
		

	}

}
