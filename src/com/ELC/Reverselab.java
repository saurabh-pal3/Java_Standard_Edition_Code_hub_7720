package com.ELC;

import java.util.Scanner;
public class  Reverselab
{
    public static void main(String[]arrs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num<10||num>100)
        {
            System.out.println("Error: Invalid Input");
        }
        else{
        System.out.println("Reversed Number: "+reverse.NumberReverser(num));
        sc.close();}



    }
}

class reverse
{
    public static int  NumberReverser(int n)
    {
        int rev=(n%10*10)+n/10;
        return rev;
    }
}