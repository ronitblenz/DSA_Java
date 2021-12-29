package com.ronit;

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=sc.nextInt();


        factor(a);

    }
    public static int factor(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println("Factorial of " + n + " is: " + a);

        return a;
        }

    }
