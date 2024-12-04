import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
