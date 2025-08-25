package com.thisuse;

import java.util.Scanner;


public class HospitalGet {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Patient Id : ");
		int PatientId=Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Patient Name : ");
		String PatientName=sc.nextLine();
		System.out.print("Enter Your  Gendar :" );
		String Gendar=sc.nextLine();
		System.out.print("Enter the Patient Age : ");
		int Age=Integer.parseInt(sc.nextLine());
		sc.close();
		Hospital saurabh=new Hospital(PatientId, PatientName, Gendar, Age);
		System.out.println(saurabh);
	}

}
