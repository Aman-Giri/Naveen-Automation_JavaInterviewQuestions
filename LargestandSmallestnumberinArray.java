import java.util.Arrays;

public class LargestandSmallestnumberinArray {
    public static void main(String[] args) {
        int[] arr = {34,22,999,9990,-89};

        int largest = arr[0];
        int smallest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}
