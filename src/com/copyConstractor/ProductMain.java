package com.copyConstractor;

public class ProductMain {

	public static void main(String[] args) {
		Product p=new Product("camera", 12, 12000, 0);
		
		System.out.println(p);
		
		Product p2=new Product(p);
		System.out.println(p2);
		
		Product1 p1= new Product1(p);
		System.out.println(p1);


	}

}
