package com.basics;

import java.util.Scanner;

public class Peacticebuva {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter employe id : ");
		int id = sc.nextInt();
		System.out.print("Enter the name of employe : ");
		String name = sc.nextLine();
		 name = sc.next();
		 sc.close();
		 
		 System.out.println("The employe id is="+id);
		 System.out.println("The employe name is="+name);
		

	}

}
