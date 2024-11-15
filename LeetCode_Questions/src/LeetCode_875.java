public class LeetCode_875 {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(arr,h));

    }
    static int minEatingSpeed(int[] arr,int h){
        int s = 1;
        int e = arr[arr.length-1];
        int time = 0;

        while(s<e){
            int mid = (s+e)/2;

            if(helper(arr,h,mid)){
                e = mid;
            }
            else {
                s = mid + 1;
            }
        }
        return s;
    }

    static boolean helper(int[] arr, int h, int mid){
        int hours = 0;
        for(int pile : arr){
            hours += (int)Math.ceil((double)pile/mid);
        }
        return hours <= h;
    }
}
