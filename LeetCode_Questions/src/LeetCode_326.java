public class LeetCode_326 {
    public static void main(String[] args) {
        int n = 27;
        boolean ans = powerofThree(n);
        System.out.println(ans);
    }
    static boolean powerofThree(int n){
        return n>0 && Math.pow(3,19)%n == 0;
    }
}
