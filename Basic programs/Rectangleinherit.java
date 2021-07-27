import java.util.Scanner;

class rectangle
{
   public int length,breadth,height;
    rectangle()
    {
        System.out.println("non parameter rectangle constructor");
    }
    rectangle(int l,int b,int h)
    {
        System.out.println("Parameter constructor of rectangle class");
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    public double arearec(){
        return (this.length*this.breadth);
    }
    public double volrec()
    {
        return (this.length*this.breadth*this.height);
    }
}
class cuboid extends rectangle
{
    cuboid(int l,int b, int h)
    {
        super(l,b,h);
        System.out.println("parameter constructor of subclass cuboid");
    }
    public double areacub()
    {
        return (2*((this.length*this.breadth)+(this.breadth*this.height)+(this.height*this.length)));
    }
    @Override
    public double volrec()
    {
        return (this.length*this.breadth*this.height);
    }
}


public class Rectangleinherit {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter length.");
          int l =sc.nextInt();
        System.out.println("Enter breadth.");
          int b=sc.nextInt();
        System.out.println("Enter height.");
          int h = sc.nextInt();
          rectangle rl = new rectangle(l,b,h);
          cuboid cd = new cuboid(l,b,h);
          double ar = rl.arearec();
          double vr = rl.volrec();
          double ac = cd.areacub();
          double vc = cd.volrec();
        System.out.printf("The area of rectangle is = %.2f ",ar);
        System.out.printf("\nThe volume of rectangle is = %.2f",vr);
        System.out.printf("\nThe area of cuboid is = %.2f",ac);
        System.out.printf("\nThe volume of cuboid is = %.2f",vc);
    }
}
