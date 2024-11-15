public class factorial {
    public static void main(String[] args) {
        double ans = fac(5);
        System.out.println(ans);
    }
    static double fac(double n){
        if(n == 0){
            return 1;
        }
        double a = n*fac(n-1);
        return a;
    }
}
