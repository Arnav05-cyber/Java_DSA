public class LeetCode_3232 {
    public static void main(String[] args) {
        int[] arr = {3,3,7,9,4,55,9,9,13,7,8,9};
        System.out.println(digitgame(arr));
    }
    static boolean digitgame(int[] arr){
        int sum=0;
        int doubled =0;
        int ch = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=10){
                doubled = doubled + arr[i];
            } else if (arr[i]<=10) {
                sum = sum + arr[i];
            }
        }

        if(doubled>sum){
            return true;
        } else if(doubled <sum){
            return true;
        } else if(sum == doubled){
            return false;
        }
    return false;
    }
}
