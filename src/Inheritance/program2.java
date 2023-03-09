package Inheritance;
class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off....");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying....");
    }
}
class CargoPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("CargoPlane is fly.....");
    }
    public void carryGoods()
    {
        System.out.println("CargoPlane carries goods....");
    }
}
class PassengerPlane extends  Aeroplane
{
    @Override
    public void fly() {
        System.out.println("PassenggerPlane is fly....");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passenger.....");
    }
}
public class program2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();
        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.carryPassenger();

    }
}
