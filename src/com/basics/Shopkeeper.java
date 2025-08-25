package com.basics;
public class  Shopkeeper
{
	public static void main(String[] s) 
	{
		int tvprice = 32500;
		double profit = 27 *tvprice/100;
		 double sellingPrice =tvprice + profit;
		
		double vat=12.7*tvprice/100;
		double servicecharge= 3.87*tvprice/100;
		
		double totalsellingprice= sellingPrice+vat+servicecharge;
		System.out.println("total selling price="+totalsellingprice);
		System.out.println("profit="+ profit);
		System.out.println("vat ="+vat);
		System.out.println("service charge. ="+servicecharge);
	}
}
