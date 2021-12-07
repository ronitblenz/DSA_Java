package com.ronit;
import java.sql.SQLOutput;
import java.util.Scanner;

public class sum_of_two_numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the First no. ");
        int a=sc.nextInt();

        System.out.println(" Enter the Second no. ");
        int b=sc.nextInt();

        int sum=a+b;

        System.out.println(" The sum of the two numbers are: " +sum);
    }
}
