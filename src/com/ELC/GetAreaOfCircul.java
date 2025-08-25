package com.ELC;

import java.util.Scanner;

import com.BLC.AreaOfCircul;

public class GetAreaOfCircul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redius of circule :");
		double n=Double.parseDouble(sc.nextLine());
		String circul=AreaOfCircul.getareaOfCircul(n);
//		System.out.println(circul);
		
		double AreaOFCircul=Double.parseDouble(circul);
		System.out.printf("Area of circul is : %.2f",AreaOFCircul);
		sc.close();
		

	}

}
