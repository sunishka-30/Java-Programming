import java.util.Scanner;
public class Passfail
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float g = (a+b+c)/3.0f;
        if(a>=33 && b>=33 && c>=33 && g >= 40 )
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }

    }
}
