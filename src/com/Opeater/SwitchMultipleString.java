package com.Opeater;

import java.util.Scanner;

public class SwitchMultipleString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the animal is [Wild/Domanstic]: " );
		String animal = sc.nextLine().toUpperCase();
		switch(animal)
		{
		case "DOG","CAT","COW","SHEEP","MOUSE" -> System.out.println("THIS ARE THEY DOMNSTIC ANIMAL :");
		
		case "TIGER","WOLF","LION","ELEFENTS","CROCODIAL","LAPEEAD" -> System.out.println("THIS ARE THEY WILD ANIMAL :");
		
		default -> System.out.println("THIS IS NO ANIMAL SPECIES");
		}
		sc.close();
		  
	}
	
	

}
