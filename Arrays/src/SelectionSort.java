import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,2,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int ansTo = ans(arr);
        System.out.println(ansTo);
    }

    static int ans(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[max]<arr[i]){
                if(i == 2){
                    return arr[i];
                }
            }
        }
        return arr[getMax(arr,0,arr.length-1)];
    }


    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getMax(arr,0,last);
            swapArr(arr,max,last);

        }

    }

    static int getMax(int[] arr,int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swapArr(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
