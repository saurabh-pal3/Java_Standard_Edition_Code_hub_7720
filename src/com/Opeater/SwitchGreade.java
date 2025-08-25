package com.Opeater;

import java.util.Scanner;

public class SwitchGreade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		System.out.print("Enter the Greade: ");
		char grade = sc.next().toLowerCase().charAt(0);
		
		String result= switch(grade)
		{
		  case 'a','b' -> "Good";
		  case 'c'-> "Medum";
		  default -> "lala";
		
		};
		sc.close();
		System.out.println("The rsult is"+result);
		
	}
	

}
