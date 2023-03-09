package ClassExample;

public class JaggedArray {
    public static void main(String[] args) {
        int [][] arr={
                {2,4,5,6},
                {4,76,75},
                {67,9,90}
        };
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
