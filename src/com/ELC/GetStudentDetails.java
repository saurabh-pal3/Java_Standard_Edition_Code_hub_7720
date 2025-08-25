package com.ELC;

import java.util.Scanner;

import com.BLC.StudentDetails;

public class GetStudentDetails {

	public static void main(String[] args) {
//	String ss=	StudentDetails.getStudentDetails(121, "Saurabhpal", 12000);
//	System.out.println(ss);
		Scanner sc=	new Scanner(System.in);	
		System.out.println("Enter the roll number: ");
		int roll=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Full name: ");
		String nama=sc.nextLine();
		System.out.println("Enter the Full fees: ");
		double fees=sc.nextDouble();
		String ss=StudentDetails.getStudentDetails(roll, nama, fees);
		System.out.println(ss);
		sc.close();

	}

}
