package com.company;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFactors(n));
    }
    static int sumFactors(int n)
    { int sum=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
                if((n/i)!=i)
                {
                    sum+=(n/i);
                }

            }
        }
        return sum;
    }
}
