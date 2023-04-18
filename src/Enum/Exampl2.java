package Enum;
enum Result
{
    PASS,FAIL,NR;
    int marks;
    Result()
    {
        System.out.println("This is consttructor");
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public int getMarks()
    {
        return marks;
    }
}
public class Exampl2
{
    public static void main(String[] args) {
        Result.PASS.setMarks(50);
        int r1 = Result.PASS.getMarks();
        System.out.println(r1);
        int r2 = Result.FAIL.getMarks();
        System.out.println(r2);
    }
}
