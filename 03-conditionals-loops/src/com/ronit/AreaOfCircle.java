package com.ronit;
import java.util.*;

public class  AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");

        int rad=sc.nextInt();

        System.out.println("The Area of the circle is "+Math.PI*rad*rad);

    }
}
