package com.ronit;
import java.util.*;

public class  AreaOfShapes{

    public static void main(String[] args) {

        //Circle

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        int rad=sc.nextInt();

        System.out.println("The Area of the circle is "+Math.PI*rad*rad);

        //Triangle

        System.out.print("Enter Base of Triangle: ");
        int base=sc.nextInt();

        System.out.print("Enter Height of Triangle: ");
        int height=sc.nextInt();

        System.out.println("Area of the Triangle is: "+0.5*base*height+" Square Unit");

        //Rectangle

        System.out.print("Enter length of rectangle: ");
        int length=sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth=sc.nextInt();

        System.out.println("Area of the Rectangle is: "+(length*breadth)+" Square Unit");


    }
}
