public class PowerFunction {
    public static void main(String[] args) {
        int x = 4;
        int n = 3;
        int ans = powerFunction(x,n);
        System.out.println(ans);
    }
    static int powerFunction(int x, int n){
        if(n!=0){
            return x*powerFunction(x,n-1);
        }
        else {
            return 1;
        }
    }
}
