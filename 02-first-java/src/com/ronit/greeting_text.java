package com.ronit;
import java.util.Scanner;

public class greeting_text {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();

        System.out.println("Hello "+st+", Have a nice day !");

    }
}
