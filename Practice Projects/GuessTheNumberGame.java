package c.company;
import java.util.Scanner;
import java.util.Random;
class Game
{   int num;
    int noofguesses;
    int g=0;
   // int randomno;
     public int Game()
     {    Random r = new Random();
          int randomno = r.nextInt(101);

          return randomno;
     }
   int c = Game();
    public void setNum() {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        iscorrectno(num);
    }
    public void iscorrectno(int num)
    {


        if(num==c)
        {
            System.out.println("Winner");
            System.out.println("No. of guesses = "+g);

        }
        if(num>c)
        {
            g=g+1;
            System.out.println("Your entered no. is greater, enter a smaller number.");
            setNum();
        }
        if(num<c)
        {
            g=g+1;
            System.out.println("Your entered no. is smaller, enter a greater number.");
            setNum();
        }
    }


}

public class GuessTheNumberGame{

    public static void main(String[] args) {

        Game no = new Game();
        no.setNum();

    }
}
