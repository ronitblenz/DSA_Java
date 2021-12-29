package com.ronit;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=sc.nextInt();
        if (Prime(a))
            System.out.println("Prime");
        else
            System.out.println("Composite");


        Prime(a);

    }
    public static boolean Prime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
