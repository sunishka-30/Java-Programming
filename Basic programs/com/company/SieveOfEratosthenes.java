package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to check prime numbers:");

        int m = sc.nextInt();
        sieve(m);

    }
    static void sieve( int m)
    {
        boolean [] arr = new boolean[m+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=m;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=m;j+=i)
                {
                    arr[j]=false;

                }

            }

        }
        System.out.println("The prime no.s till "+m+" are:");
        for (int i = 2; i <= m; i++)
        {
            if (arr[i])
                System.out.print(i + " ");
        }

    }
}
