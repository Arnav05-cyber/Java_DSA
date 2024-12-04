import java.net.Inet4Address;

public class LeetCode_188 {
    public static void main(String[] args) {
        int[] arr = {6,1,3,2,4,7};
        int k = 2;
        System.out.println(maxProfit(arr,k));
    }

    static int maxProfit(int[] arr, int k){
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int temp = k;
        int finalp=0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {



            if(temp == 0){
                break;
            }

            if(maxprofit<arr[i] - minPrice){
                finalp = arr[i]-minPrice;
                for (int j = i+1; j < arr.length; j++) {
                    if(finalp<arr[j] - minPrice){
                        finalp = arr[j] - minPrice;
                        sum+=finalp;
                        temp--;
                        maxprofit = 0;
                        finalp = 0;
                        minPrice = Integer.MAX_VALUE;
                    }
                }
            }

            if(arr[i] < minPrice){
                minPrice = arr[i];
            }

        }
        return sum;
    }
}
