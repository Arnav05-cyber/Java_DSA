public class LeetCode_744 {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'j';
        char ans = smallestLetter(arr,target);
        System.out.println(ans);
    }
    static char smallestLetter(char[] arr, char target){
        if(target>=arr[arr.length-1]){
            return arr[0];
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return arr[start];
    }
}
