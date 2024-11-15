public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,14,16,17};
        int target = 15;
        int ans = floorNum(arr,target);
        System.out.println(ans);
    }
    static int floorNum(int[] arr, int target){

        if(target<arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>mid){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
