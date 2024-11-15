public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum1 = n+sum(n-1);
        return sum1;
    }
}
