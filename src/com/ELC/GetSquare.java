package com.ELC;

import java.util.Scanner;

import com.BLC.FindSquar;

public class GetSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the area of squre= ");
		int num=Integer.parseInt(sc.nextLine());
		FindSquar.getSquare(num);
	}

}
