package FindAverage;

public class Problem1 {
    public  static int average(int[] arr)
    {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<minValue)
            {
                minValue = arr[i];
            }
        }
        for(int i = 0; i<arr.length-1;i++)
        {
            if(arr[i]>maxValue)
            {
                maxValue= arr[i];
            }
        }
        return (minValue + maxValue)/2;
    }
    public static void main(String[] args) {
        int []arr= {12,4,5,22,8};
        System.out.println(average(arr));
    }
}
