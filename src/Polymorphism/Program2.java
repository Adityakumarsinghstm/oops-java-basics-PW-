package Polymorphism;

import java.awt.*;

class AeroPlane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is going to takeOff..");
    }
    public void fly()
    {
        System.out.println("Aeroplane flies on different layer...");
    }
}
class PassengerPlane extends AeroPlane
{
    public void takeOff()
    {
        System.out.println("PassengerPlane is going to takeoff...");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies on lower layer...");
    }
}
class CargoPlane extends AeroPlane
{
    public void takeOff()
    {
        System.out.println("cargoplane is going to takeoff..");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies on medium layer..");
    }
}
class FighterPlane extends AeroPlane
{

    public void takeOff() {
        System.out.println("FighterPlane is going to takeOff...");
    }


    public void fly() {
        System.out.println("Fighter plane flies on higher layer...");
    }
}
class Airport
{
    public void poly(AeroPlane ref)
    {
        ref.takeOff();
        ref.fly();

        System.out.println("-----------------------------------------------------");
    }
}
public class Program2 {
    public static void main(String[] args) {
      AeroPlane a1 = new AeroPlane();
      PassengerPlane pp = new PassengerPlane();
//      pp.takeOff();
//      pp.fly();

      CargoPlane cp = new CargoPlane();
//      cp.takeOff();
//      cp.fly();

      FighterPlane fp = new FighterPlane();
//      fp.takeOff();
//      fp.fly();

      Airport ap = new Airport();
      ap.poly(pp);
      ap.poly(cp);
      ap.poly(fp);
    }
}
