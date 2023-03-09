package ClassExample;

public class EnhancedLoop {
    public static void main(String[] args) {


        System.out.println();
        int[][] arr= {
                {1,2,3,78,98},
                {4,5,6},
                {7,8,9,45},
        };
        for (int[] a: arr
             ) {
            for (int b:a
                 ) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
