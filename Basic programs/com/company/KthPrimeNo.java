package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] a =new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Kth primes are: ");
        for(int i=0;i<t;i++)
        {
            System.out.println(kPrime(a[i]));
        }
    }
    static int  kPrime(int n)
    {
        int N = 86028121;
        boolean[] ar = new boolean[N + 1];
        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.fill(ar, true);
        ar[0] = false;
        ar[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (ar[i])
            {
                for (int j = i * i; j <=N; j += i)
                {
                    ar[j] = false;
                }
            }
        }
        for(int i=2;i<=N;i++)
        {
            if(ar[i])
            {
                ds.add(i);
            }
        }
        return ds.get(n-1);
    }
}
