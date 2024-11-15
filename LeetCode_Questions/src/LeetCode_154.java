public class LeetCode_154 {
    public static void main(String[] args) {
        int[] arr = {3,1,3};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int s = 0;
        int e = arr.length-1;

        //check to see if arr is of one element

        if(arr.length == 1){
            return arr[s];
        }

        //check 1
        if(arr[s]<arr[e]){
            return arr[s];
        }

        if(dupes(arr) == true){
            return arr[s];
        }

        //check 2
        if(arr[s] >= arr[e]){
            //arr is rotated
            return arr[peakEle(arr)+1];
            //return rotatedBS(arr);
        }


        return -1;
    }


    static int peakEle(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] || arr[mid] == arr[end]) {
                if ((arr[start] > arr[start + 1]) && (start < arr.length-1)) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static boolean dupes(int[] arr){
        int s = 0;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[s] == arr[i]){
                swapped = true;
            }
            else {
                return false;
            }
        }
        return swapped;
    }
}
