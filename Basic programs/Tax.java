import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0.0f;
        if(income<2.5f)
        {
            tax = tax + 0;
        }
        else if(income>=2.5f && income<=5.0f)
        {
            tax = tax + 0.05f * (income-2.5f);
        }
        else if(income>5.0f && income<=10.0f)
        {
            tax = tax + 0.05f * (income-2.5f);
            tax = tax + 0.2f  *  (income-5.0f);
        }
        else if(income>10.0f)
        {
            tax = tax + 0.05f * (income-2.5f);
            tax = tax + 0.2f  *  (income-5.0f);
            tax = tax + 0.3f *   (income-10.0f);
        }
        System.out.println("The tax to be paid by the employee = Rs. "+tax+"lakhs");
    }
}
