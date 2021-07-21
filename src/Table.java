import java.util.Scanner;

public  class Table {
     void multi(int n) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + (n * i);
            System.out.format("%2d X %2d = %4d", n, i, n * i);
            System.out.println();

        }
        System.out.println("The sum of numbers in table of " + n + " = " + sum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Table obj = new Table();
        obj.multi(n);

          }
}

