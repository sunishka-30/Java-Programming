package com.company;
import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] a =new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            primeFac(a[i]);
        }
    }
    static void primeFac(int n)
    {
        int N = 1000000;
        int [] arr = new int[N+1];
       for(int i=1;i<=n;i++)
       {
           arr[i]=i;
       }
        for(int i=2;i*i<=N;i++)
        {
            if(arr[i]==i)
         {
            for(int j=i*i;j<=N;j+=i)
            {   if(arr[j]==j)
               {
                arr[j]=i;
               }
            }
         }
        }
        while(n!=1)
        {
            System.out.print(arr[n]+" ");
            n=n/arr[n];
        }
        System.out.println();
    }
}
