package StaticProject;

import java.util.Scanner;

class Farmer
{
    int pa;
    float td;
    float ri;
    float si;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amout you required");
        pa = sc.nextInt();
        System.out.println("Enter the time duration");
        td=sc.nextFloat();
        ri=8.5f;

    }
    void calculate()
    {
        si = (pa*ri*td)/100;

    }
    void display()
    {
        System.out.println("simple interest is"+si);
    }

}
public class LaunchFarmer {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.calculate();
        f1.display();
        Farmer f2 = new Farmer();
        f2.input();
        f2.calculate();
        f2.display();


    }
}
