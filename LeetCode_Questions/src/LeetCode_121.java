public class LeetCode_121 {
    public static void main(String[] args) {
        int[] arr = {7,1,4};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] arr){
        int minp = Integer.MAX_VALUE;
        int maxp = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minp){
                minp = arr[i];
            }

            if(maxp < (arr[i]-minp)){
                maxp = arr[i]-minp;
            }
        }

        return maxp;
    }
}
