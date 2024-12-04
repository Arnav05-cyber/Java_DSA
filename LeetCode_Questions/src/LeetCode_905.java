import java.util.Arrays;

public class LeetCode_905 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
    static int[] sortArray(int[] arr){
        int sindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                swap(i,sindex,arr);
                sindex++;
            }
        }
        return arr;
    }

    static void swap(int i,int sindex, int[] arr){
        int temp = arr[sindex];
        arr[sindex] = arr[i];
        arr[i] = temp;
    }
}
