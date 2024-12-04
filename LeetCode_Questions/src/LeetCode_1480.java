import java.util.Arrays;

public class LeetCode_1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(func(nums)));
    }
    static int[] func(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
