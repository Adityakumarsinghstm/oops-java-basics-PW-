package Enum;
enum Result1
{
    PASS,FAIL,NR;
}
public class Example3 {
    public static void main(String[] args) {
        Result1 res = Result1.FAIL;
        switch (res) {
            case PASS:
                System.out.println("Passed!");
                break;
            case FAIL:
            System.out.println("Failed!");
            break;
            case NR:
                System.out.println("No result");
                break;
        }
    }
}
