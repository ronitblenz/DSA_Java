package com.ronit;
import java.util.Scanner;
public class inputs_till_user_enters_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "0";
        int i, s = 0;

        while (!n.equals("x")) {
            s += Integer.valueOf(n);
            System.out.println("Enter: ");
            n = sc.next();
        }
        System.out.println("Sum = " + s);
    }

}