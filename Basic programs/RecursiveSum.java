import java.util.Scanner;

public class RecursiveSum {
    int sum(int n)
    { int s=0;
        if(n==1)
        {
            return 1;
        }
        else
        {
           return  n + sum(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RecursiveSum obj = new RecursiveSum();
         int s= obj.sum(n);
        System.out.println(s);
    }
}
