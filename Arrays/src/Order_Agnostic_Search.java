public class Order_Agnostic_Search {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1  };
        int target = 4;
        int ans = OAbinarySearch(arr,target);
        System.out.println(ans);
    }
    static int OAbinarySearch(int[] arr, int target){
        if(arr[0]<arr[arr.length-1]){
            int s = 0;
            int e = arr.length-1;
            while(s<e){
                int mid = s+(e-s)/2;
                if(target<arr[mid]){
                    e = mid-1;
                }
                else if(target>arr[mid]){
                    s = mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        else{
            int s = 0;
            int e = arr.length-1;
            while(s<e){
                int mid = s+(e-s)/2;
                if(target<arr[mid]){
                    s = mid+1;
                }
                else if(target>arr[mid]){
                    e = mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
