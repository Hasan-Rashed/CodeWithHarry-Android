package com.rashed.chapter2;

import java.util.Scanner;

public class Chapter2PS
{
    public static void main(String[] args)
    {
        int a = 6;

        for (int i = 0; i < 10; i++)
        {
            System.out.println(a + " X " + (i + 1) + " = " + a * (i + 1));
        }

        int day = 5;//sc.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
        }

        int sum = 0, i = 0, n = 3;

        while(i < n)
        {
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum is: " + sum);

        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col < row; col++)
            {
                System.out.print(" ");
            }
            for(int col = 0; col <= 5 - row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(Math.round(5.49));
    }
}
