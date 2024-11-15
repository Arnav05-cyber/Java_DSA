public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,9,14,16,17};
        int target = 18;
        int ans = ceilingNum(arr,target);
        System.out.println(ans);
    }
    static int ceilingNum(int[] arr,int target){

        if(target>arr[arr.length-1]){
            return -1;
        }

        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]>target){
                e = m-1;
            }
            else if(arr[m]<target){
                s = m+1;
            }
            else{
                return m;
            }
        }
        return s;
    }
}
