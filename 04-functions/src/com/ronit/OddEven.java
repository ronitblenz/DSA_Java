package com.ronit;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=sc.nextInt();

        logic1(a);

    }
    public static int logic1(int n)
    {
        if(n%2==0)
        {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        return n;
    }
}
