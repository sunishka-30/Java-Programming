import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array.");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array.");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean sort=true;
        boolean dessort = true;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1]) {
                sort = false;
                break;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1]) {
                dessort = false;
                break;
            }
        }
        if(sort||dessort)
        {
            System.out.println("The array is sorted.");
        }
        else
        {
            System.out.println("The array is not sorted.");
        }
    }
}
