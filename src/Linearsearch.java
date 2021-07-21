import java.util.Scanner;
public class Linearsearch {
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
        System.out.println("Enter the element to be searched.");
        int e = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==e)
            {
                System.out.println("The element "+e+" is present in array at position "+(i+1));
                break;
            }
        }
    }
}
