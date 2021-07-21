import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array.");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array.");
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l = Math.floorDiv(n,2);
        for(int j=0;j<l;j++)
        {
            int temp = a[j];
           a[j]=a[n-1-j];
           a[n-1-j]=temp;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
