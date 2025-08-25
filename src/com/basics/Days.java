package com.basics;

public class Days {

    public static void main(String[] s) {
        if (s.length == 0) {
            System.out.println("Please provide total days as a command line argument.");
            return;
        }

        int totalDays = Integer.parseInt(s[0]);

        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;

        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        System.out.println("Years  = " + years);
        System.out.println("Months = " + months);
        System.out.println("Days   = " + days);
    }
}
