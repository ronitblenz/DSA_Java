package com.ronit;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome ");
        original = in.nextLine();

        pal(original);

    }
    public static int pal(String original)
    {
        int length = original.length();
        String reverse = new String();
        for (int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
        return length;
    }
}

