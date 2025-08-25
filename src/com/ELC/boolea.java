package com.ELC;

import java.util.Scanner;

import com.BLC.Boolen;

public class boolea {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		if(Boolen.isEven(n))
		{
			System.out.println(n+"is even");
		}
		else
		{
			System.out.println(n+"is obb");
			sc.close();
		}
	}

}
