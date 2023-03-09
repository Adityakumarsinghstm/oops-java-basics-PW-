package Interface;

public interface Animal {
    void eat();
}
class Dog implements Animal
{

    public void eat() {
        System.out.println("Dog eats meat and vegetable both..");
    }
}
class Tiger implements Animal
{

    public void eat() {
        System.out.println("Tiger only eats meat...");
    }
}
