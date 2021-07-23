import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix.");
        int r= sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the elements of matrix 1.");
        int[][]m1=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2.");
        int[][]m2=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }
        int [][]m3=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
