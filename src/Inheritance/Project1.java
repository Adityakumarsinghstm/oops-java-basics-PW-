package Inheritance;

import java.util.Scanner;

abstract class Shape
{
    float area;
    abstract  public void input();
    abstract public void compute();
    public void display()
    {
        System.out.println("The area  is "+area);
    }
}
class Rectangle extends Shape
{
    float length;
    float breadth;


    public void input()
    {
        System.out.println("The Rectangel programme: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of length : ");
        length = scan.nextFloat();
        System.out.println("Enter the value of breadth :");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length * breadth;
    }


}

class Square extends  Shape
{
    float length;


    public void input()
    {
        System.out.println("The Square programme: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of length : ");
        length = scan.nextFloat();

    }

    public void compute()
    {
        area = length * length;
    }


}
class Circle extends Shape
{
    float radius;


    public void input()
    {
        System.out.println("The Square programme: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        radius = scan.nextFloat();

    }

    public void compute()
    {
        area = 3.14f*radius*radius;
    }


}
class Geometry
{
    public void poly(Shape sp)
    {
        sp.input();
        sp.compute();
        sp.display();
    }
}
public class Project1 {
    public static void main(String[] args) {
      Rectangle rec = new Rectangle();
      Square sq = new Square();
      Circle cr = new Circle();

      Geometry gm = new Geometry();
      gm.poly(rec);
      gm.poly(sq);
      gm.poly(cr);

    }
}
