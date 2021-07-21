import java.util.Scanner;
class Employee
{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EmployeeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String st = sc.nextLine();
        System.out.println("Enter salary");
        int s = sc.nextInt();
        Employee sunishka = new Employee();
        sunishka.name=st;
        sunishka.salary = s;
        System.out.println("Name:-"+ sunishka.getName());
        System.out.println("Salary:-"+sunishka.getSalary());

    }

}
