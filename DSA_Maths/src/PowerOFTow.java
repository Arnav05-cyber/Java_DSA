public class PowerOFTow {
    public static void main(String[] args) {
        int n = 16;
        if(n == 0){
            boolean ans = false;
        }
        boolean ans = (n&(n-1)) == 0;
        System.out.println(ans);
    }
}
