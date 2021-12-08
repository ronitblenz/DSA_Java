package com.ronit;

import java.util.Scanner;

public class inr_usd {
    public static void main(String[] args) {
        System.out.println("Enter Currency in INR : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("The currency in USD (approx) : "+a/75.5);

    }
}


