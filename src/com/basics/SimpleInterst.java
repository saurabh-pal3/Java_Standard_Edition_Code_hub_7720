package com.basics;

public class SimpleInterst {

	public static void main(String[] s) {
		int Principal = Integer.parseInt(s[0]);
		int rate = Integer.parseInt(s[1]);
		int time = Integer.parseInt(s[2]);
		
		int simpleInterest=(Principal*time*rate)/100;
		
		int amount=Principal+simpleInterest;
		
		System.out.println("Simple Interest="+simpleInterest);
		System.out.println("Amount="+amount);

	}

}
