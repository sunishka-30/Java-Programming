//import java.util.Scanner;
class Cylinder
{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }
    public double  surfacearea()
    {
        return 2*3.142*radius*radius+2*3.142*radius*height;
    }
    public double volume()

    {
        return 3.142*radius*radius*height;
    }
}
public class CylinderClass {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(9,12);
        //cyl.setHeight(12);
        System.out.println(cyl.getHeight());
       // cyl.setRadius(9);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.surfacearea());
        System.out.println(cyl.volume());
    }
}
