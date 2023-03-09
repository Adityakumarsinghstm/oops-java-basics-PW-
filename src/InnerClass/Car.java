package InnerClass;

public class Car {
    class Engine
    {
        public  void display()
        {
            System.out.println("This is inner class method....");
        }
    }
    public static void main(String[] args) {
        System.out.println("This is main method class....");

         Car c1 = new Car();
         Car.Engine e1 = new Car().new Engine();
         e1.display();

    }
}
