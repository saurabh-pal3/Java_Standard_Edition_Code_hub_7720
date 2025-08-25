package com.NewOpps;
import java.util.Scanner;

 class Pal
{
   int day;
   public void choko()
   {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the month (1 to 12): ");
       day = sc.nextInt();

       switch (day) {
           case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
           case 4, 6, 9, 11 -> System.out.println("30 days");
           case 2 -> System.out.println("28 or 29 days (February)");
           default -> System.out.println("Error: Invalid Input");
   }
    sc.close();
}
}


public class Saurabh
{
   public static void main(String[] args)
   {
     Pal lala=new Pal();
       lala.choko();
   }
}
