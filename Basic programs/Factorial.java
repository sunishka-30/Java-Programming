import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a=n;
        int f=1;
        for(f=1;n>0;n--)
        {
            f=f*n;
        }
        System.out.println("The factorial of "+a+" = "+f);

    }
}
