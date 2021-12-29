package com.ronit;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=sc.nextInt();

        nom(a);

    }
    public static int nom(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a = a + i;
        }
        System.out.println(" Sum Of First "+n+" Natural Numbers is: " + a);

        return a;
    }

}