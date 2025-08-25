package com.Oops;

import java.util.Scanner;

public class Mcq {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Employe id=");
		int id =Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter employe name=");
		String name = sc.nextLine();
		
		System.out.println("Emoplyee id is="+id);
		System.out.println("Emoplyee name is="+name);
		
		sc.close();
	 

	}

}
