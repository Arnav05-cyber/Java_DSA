public class LeetCode_1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = indexMountain(arr, target);
        System.out.println(ans);
    }

    static int indexMountain(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstHalf = binarySearch1(arr,target,0,peak);
        int secondHalf = binarySearch2(arr,target,peak,arr.length-1);
        if(firstHalf != -1){
            return firstHalf;
        }
        else if(secondHalf != -1){
            return secondHalf;
        }
        if(firstHalf<secondHalf){
            return firstHalf;
        }
        return -1;
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch1(int[] arr, int target,int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
        static int binarySearch2( int[] arr, int target,int start, int end){


            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid - 1;
                } else if (target > arr[mid]) {
                    end = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

