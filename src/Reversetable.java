import java.util.Scanner;
public class Reversetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =n ;i>=1;i--)
        {
            System.out.format("%2d X %2d = %4d",n,i,n*i);
            System.out.println();
        }

    }
}
