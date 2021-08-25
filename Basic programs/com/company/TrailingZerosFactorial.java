package com.company;

import java.util.Scanner;

public class TrailingZerosFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("There are "+ countZeros(n) + " trailing zeroes in the factorial of " + n+".");
    }
    static int countZeros(int n)
    { int c=0;
        for(int i=5;i<=n;i=i*5)
        {
            c=c+(n/i);
        }
        return c;
    }

}
