package com.company;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPrime(n));

    }

    static String checkPrime(int n) {
        int c = 0;
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                c++;
                if ((n / i) != i)
                {
                    c++;
                }

            }
        }
        if (c == 2) return ("Prime");
        else return ("Not prime");
    }
}
