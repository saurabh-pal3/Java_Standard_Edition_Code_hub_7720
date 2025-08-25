package com.ELC;

import java.util.Scanner;

import com.BLC.AreaofRectangle;

public class GetAreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter the Length =");
		int length=Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Breath =");
		int breath=Integer.parseInt(sc.nextLine());
		
		System.out.println("THe area of Rectamgle :"+AreaofRectangle.getAreaOfRectangle(length, breath));
		sc.close();

	}
	

}
