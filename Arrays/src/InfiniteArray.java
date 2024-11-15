public class InfiniteArray {
    public static void main(String[] args) {
        int[] infiniteArr = {1,2,3,4,5,6,6,7,8,9};
        int target = 9;
        int ans = infiniteArraySearch(infiniteArr,target);
        System.out.println(ans);
    }
    static int infiniteArraySearch(int[] arr, int target){
        int e = 0;
        int i = 0;
        int end = 0;
        while(true){
            if(arr[i]>=target){
                end = i;
                break;
            }
            i++;
        }
        int start = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
