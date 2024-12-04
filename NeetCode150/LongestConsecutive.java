package NeetCode150;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {9,1,4,7,3,-1,0,5,8,-1,6};
        int ans = longestConsecutive(arr);
        System.out.println(ans);
    }

    static int longestConsecutive(int[] arr) {

        if(arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);

        int res = 0;
        int curr = arr[0];
        int streak = 0;
        int i = 0;

        while(i<arr.length){
            if(curr != arr[i]){
                curr = arr[i];
                streak=0;
            }
            while(i< arr.length && arr[i] == curr){
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res,streak);
        }
        return res;
    }
}
