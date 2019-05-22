package com.auxolabs.general;
import java.util.Scanner;
public class LeapYear {


    public static void main(String[] args) {
        while (true) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter the year");
            int year = s1.nextInt();
            isLeapYear(year);
        }
    }

    private static void isLeapYear(int year) {
        if ((year % 4 == 0))
        {
            if ((year  % 100 == 0) )
            {
                if(year % 400 != 0)
                {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}

