package com.Opeater;

import java.util.Scanner;

public class Owel {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the charester? : ");
		
		char ch= sc.next().toLowerCase().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("Digit ");
			System.exit(0);
		}
		if(ch>'0')
		{
			System.out.println("Special charester");
			System.exit(0);
		}
			
		
		switch(ch)
		{
		case 'a','e','i','o','u' -> System.out.println("Ovwel");
		default -> System.out.println("Consonant");

	}
		
		sc.close();
	}
}


