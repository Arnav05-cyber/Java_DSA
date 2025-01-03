public class LeetCode_852 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        int ans = peakIndex(arr);
        System.out.println(ans);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }
}