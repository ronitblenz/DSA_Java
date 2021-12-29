package com.ronit;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();

        add(a,b);

    }
    public static int add(int x, int y)
    {
        int sum;
        sum = x+y;
        System.out.println("The sum is : "+sum);
        return sum;
    }

}
