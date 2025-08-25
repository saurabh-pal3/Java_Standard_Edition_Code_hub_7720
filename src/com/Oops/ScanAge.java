package com.Oops;

import java.util.Scanner;

public class ScanAge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age=");
		int age = sc.nextInt();
		System.err.println("Your age="+age);
		sc.close();
	}

}
