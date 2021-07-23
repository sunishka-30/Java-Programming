import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c =5;
        int comp=0;
        int p=0;
        System.out.println("Start your Game.");
        System.out.println("Enter:\n0 for Rock\n1 for Paper\n2 for Scissors");
        while(c!=0)
        {
            Random r = new Random();
            int randomno = r.nextInt(3);

            int no = sc.nextInt();
            System.out.println("Your choice is:"+no);
            System.out.println("Computer's choice is:" + randomno);
            if((no==0 && randomno==1) || (no==1 && randomno==2) || (no==2 && randomno==0))
            {
                comp++;
            }
            else if((no==1 && randomno==0) || (no==2 && randomno==1)||(no==0 && randomno==2))
            {
                p++;

            }
            c--;

            System.out.println("Your Points = " + p + "\nComputer's points = " + comp);
            System.out.println("Chances left = " +c);
            if(c!=0){
                System.out.println("Enter your choice again.");
            }

        }
        System.out.println("Your total points are: "+p);
        System.out.println("Computer's total points are: "+comp);
        if(comp>p)
        {
            System.out.println("Oops! You lost by " + (comp-p)+" points.");
        }
        else if(comp<p)
        {
            System.out.println("Hurrah! You won by " + (p-comp) +" points.");
        }
        else
        {
            System.out.println("Ah! It's a tie.");
        }

    }

}
