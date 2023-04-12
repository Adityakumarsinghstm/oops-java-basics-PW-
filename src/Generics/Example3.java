package Generics;

import java.awt.*;

class  Gen<T>
        {
            T obj;
            public  Gen(T obj)
            {
                this.obj = obj;
            }
            public void display()
            {
                System.out.println("The type of data is "+obj.getClass().getName());
            }

            public T getObj() {
                return obj;
            }
        }
public class Example3 {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);
        System.out.println(g.getObj());
        g.display();
        Gen<String> g1 = new Gen<String>("Rahul");
        System.out.println(g1.getObj());
        g1.display();

    }
}
