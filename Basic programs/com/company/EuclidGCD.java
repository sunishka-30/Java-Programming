package com.company;

import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(euclidGcd(n,m));
    }
    static int euclidGcd(int n, int m)
    {
        if (n==0)
            return m;
        return (euclidGcd(m%n,n));
    }
}
