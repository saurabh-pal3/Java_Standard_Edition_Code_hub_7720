package com.factory_design_pattern;

import java.util.Scanner;

public class ProductGet {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the no of product you want ? :");
		int noofproduct=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=noofproduct;i++)
		{
			Product p1=Product.getproduct();
			System.out.println(p1);
		}

	}

}
