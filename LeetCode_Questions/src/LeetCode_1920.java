public class LeetCode_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,4,6,8};
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int e = nums[i];
            ans[i] = nums[e];
        }
    }
}
