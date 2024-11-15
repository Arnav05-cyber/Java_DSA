public class Fibonachi_Recursion {
    public static void main(String[] args) {
        int ans = fibonachi(6);
        System.out.println(ans);
    }

    static int fibonachi(int n){
        if(n<2) {
            return n;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }
}
