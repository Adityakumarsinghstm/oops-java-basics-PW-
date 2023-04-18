package Annotation;
class Plane
{
    public void planeFliesAtHeigh()
    {
        System.out.println("Plane is flying...");
    }
}
class CargoPlane extends Plane
{
    public void planeFliesAtHeigH()
    {
        System.out.println("Cargo plane is Flying...");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Plane p1 = new CargoPlane();
        p1.planeFliesAtHeigh();

    }
}
