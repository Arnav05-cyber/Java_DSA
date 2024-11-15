public class BiinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = (s+e)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[m]>target){
            return search(arr,target,0,m-1);
        }
        if(arr[m]<target){
            return search(arr,target,m+1,arr.length-1);
        }
        return 0;
    }
}
