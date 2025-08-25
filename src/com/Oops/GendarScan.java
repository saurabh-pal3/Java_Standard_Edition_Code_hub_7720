package com.Oops;

import java.util.Scanner;

public class GendarScan {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your gendar[Male/Female]");
		String ch = sc.nextLine();
		System.out.print("You are ="+ch);
		sc.close();
		

	}

}
