package com.ShallowCopy;

public class ProductGet {

	public static void main(String[] args)
	{
		Product p1=new Product("HP", 60000);
		System.out.println(p1);
		
		Product p2=p1;
		System.out.println(p2);
		
		System.out.println("Modifiing value ");
		
		p2.setBrand("dell");
		p2.setPrice(12000);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
