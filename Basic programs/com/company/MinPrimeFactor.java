package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinPrimeFactor {
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
            System.out.println(checkMin(a[i]));
        }

    }
    static int checkMin(int n)
    {  int N = 1000000;
        int [] arr = new int[N+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        arr[1]=0;
        for(int i=2;i*i<=N;i++)
        {   if(arr[i]==1)
          {
              for(int j=i*i;j<=N;j+=i)
              {   if(arr[j]!=0)
                 {
                     arr[i]++;
                     arr[j]=0;
                 }
              }
          }
        }
        return arr[n];
    }
}
