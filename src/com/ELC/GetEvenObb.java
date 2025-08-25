package com.ELC;

import java.util.Scanner;

import com.BLC.Classprogram;

public class GetEvenObb {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :" );
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("The result is= " +Classprogram.numberIsEvenObb(num));

	}

}
