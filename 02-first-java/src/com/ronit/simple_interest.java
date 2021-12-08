package com.ronit;
import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        int p=sc.nextInt();
        System.out.println("Enter Time in years: ");
        int t=sc.nextInt();
        System.out.println("Enter Rate of Interest: ");
        int r=sc.nextInt();

        int result= ((p*r*t)/100)+p;

        System.out.println("The total amount is "+result);

    }
}
