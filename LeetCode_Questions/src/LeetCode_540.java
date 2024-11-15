public class LeetCode_540 {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(singleNonDuplicate(arr));

    }
    static int singleNonDuplicate(int[] arr){
            int s = 0;
            int e = arr.length-1;
            int ans = 0;
            if(arr.length == 1){
                return arr[0];
            }
            if(arr.length != 1) {
                if (arr[e] != arr[e - 1]) {
                    return arr[e];
                } else if (arr[s] != arr[s + 1]) {
                    return arr[s];
                }
            }



            while(s<=e){
                int mid = (s+e)/2;

                if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                    return arr[mid];
                }

                if(((mid%2 == 0) && arr[mid] == arr[mid+1]) || ((mid%2 == 1) && arr[mid] == arr[mid-1])){
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }

            }
            return -1;
    }
}
