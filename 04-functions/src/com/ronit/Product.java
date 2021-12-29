package com.ronit;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();

        multiply(a,b);

    }
    public static int multiply(int x, int y)
    {
        int sum = x*y;
        System.out.println("The Product is : "+sum);
        return sum;
    }

}
