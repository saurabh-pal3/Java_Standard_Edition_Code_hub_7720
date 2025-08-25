package com.BLC;

public class AreaOfCircul {

	public static String getareaOfCircul(double r)
	{
		if(r<=0)
		{
			return ""+(-1);
		}
		else
		{
			final double pi=3.14;
			double areaofcircul=pi*r*r;
			return ""+areaofcircul;
			
		}
		

	}

}
