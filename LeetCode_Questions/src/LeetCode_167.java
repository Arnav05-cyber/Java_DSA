import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }


    static int[]  twoSum(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            if(arr[s]+arr[e] == target){
                return new int[]{s+1,e+1};
            }
            else if(arr[s]+arr[e]>target){
                e = e-1;
            }
            else {
                s = s+1;
            }
        }
        return new int[]{-1,-1};
    }
}
