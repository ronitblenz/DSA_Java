package com.ronit;
import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b)
        {
            System.out.println("The greater no. is: "+a);
        }
        else
        {
            System.out.println("The greater no. is: "+b);
        }
    }
}
