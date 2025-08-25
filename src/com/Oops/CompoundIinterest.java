package com.Oops;

public class CompoundIinterest {

	public static void main(String[] a) {
		double principal=Double.parseDouble(a[0]);
		double rate=Double.parseDouble(a[1]);
		
		double amount=principal*((1+rate/100)*(1+rate/100));
		System.out.println("Principal = "+principal);
		System.out.println("Rate ="+rate+"%");
		System.out.println("compound interest for 3 years?= "+amount);
		


	}

}
