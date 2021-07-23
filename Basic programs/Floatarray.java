import java.util.Scanner;
public class Floatarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float [] arr = new float[n];
        float sum =0.0f;
        for(int i =0;i<n;i++)
        {
             arr[i]= sc.nextFloat();
             sum = sum + arr[i];

        }
        for(float i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.format("The sum of elemnts of array is = %.2f ",sum);



    }
}
