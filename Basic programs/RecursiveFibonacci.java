import java.util.Scanner;

public class RecursiveFibonacci {
    int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return  fib(n-1) + fib(n-2);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RecursiveFibonacci obj = new RecursiveFibonacci();
        int s= obj.fib(n);
        System.out.println(s);
    }
}
