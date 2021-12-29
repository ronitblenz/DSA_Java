package com.ronit;
import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();

        logic(age);

    }
    public static int logic(int age)
    {
        if(age>=18)
        {
            System.out.println("You are eligible for the elections");
        }
        else{
            System.out.println("You are not eligible for the elections");
        }
        return age;
    }
}
