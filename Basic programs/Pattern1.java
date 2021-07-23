import java.util.Scanner;
public class Pattern1
{
    void patt(int n)
    {
        if(n>0) {



            for (int i = n; i >= 1; i--) {
                System.out.print("* ");
            }
            System.out.println();
            patt(n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern1 obj = new Pattern1();
        obj.patt(n);
    }
}
