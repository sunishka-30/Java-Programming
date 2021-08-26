package com.company;

import java.util.Scanner;

public class FastPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and power to be calculated:");
        long a = sc.nextLong();
        long b = sc.nextLong();
        int n= 10_000_000_07;
        long res = fastPower(a,b,n);
        System.out.println(res);

    }
    static long fastPower(long a, long b, int n) {

        long res = 1;

        while ( b > 0) {

            if ( (b&1) != 0) {
                res = (res * a % n) % n;
            }

            a = (a % n * a % n) % n;
            b =  b >> 1;
        }

        return res;

    }
}
