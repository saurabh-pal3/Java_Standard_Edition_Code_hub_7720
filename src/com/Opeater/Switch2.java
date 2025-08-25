package com.Opeater;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter if prime number is not : ");
		int n = sc.nextInt();
	
		switch(n % 2)
		{
		case 0 -> 
		{
		System.out.println("even");
//		System.out.println("You are the Goat");
		}
		
		default -> System.out.println("obb");
		}
		
		
			
	
		sc.close();
	} 

}
