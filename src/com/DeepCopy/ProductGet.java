package com.DeepCopy;

public class ProductGet {

	public static void main(String[] args)
	{
		Product p1=new Product(1000);
		System.out.println(p1);
		
		Product p2=new Product(0);
		System.out.println(p2);
		
		
		p2.setPrice(p1.getPrice());
		System.out.println(p2);
		
		
		System.out.println("modifying thr value ");
		
		p1.setPrice(2999);
		System.out.println(p1);
		p2.setPrice(12);
		System.out.println(p2);
		
	}

}
