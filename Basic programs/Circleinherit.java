import java.util.Scanner;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Circleinherit{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int r=sc.nextInt();
         int h=sc.nextInt();
         Circle objC = new Circle(r);
        Cylinder1 obj = new Cylinder1(r,h);
        double v= obj.volume();
        double a = objC.area();
        System.out.printf("The volume of cylinder=%.2f\n",v);

        System.out.printf("The area of circle=%.2f",a);

    }
}
