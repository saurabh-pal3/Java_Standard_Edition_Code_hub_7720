package com.Oops;

public class Profit {

	public static void main(String[] s) 
	{
		int sp =Integer.parseInt(s[0]);
		int cp = Integer.parseInt(s[1]);
		 int profit= sp-cp;
		 int loss= cp-sp;
		 double profitpercentage=(double)(profit/cp)*100;
		 double losspercentage=(double) (loss/cp)*100;
		 
		 System.out.println("Profit ="+profit);
		 System.out.println("Loss = "+loss);
		 System.out.println("Profit percentage = "+profitpercentage);
		 System.out.println("Loss percentage ="+losspercentage);
	

	}

}
