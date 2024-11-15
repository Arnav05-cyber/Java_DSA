public class LeetCode_367 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        int s = 0;
        int e = (int)Math.sqrt(num);

        while(s<=e){
            int mid = (e+s)/2;

            if(mid*mid == num){
                return true;
            }
            else if(mid*mid > num){
                e = mid-1;
            }
            else {
                s = mid+1;
            }

        }
        return false;
    }
}
