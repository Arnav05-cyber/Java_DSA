import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
    static int[] bubblesort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return arr;
    }
}
