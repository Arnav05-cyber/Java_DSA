public class SumOfSquares {
    public static void main(String[] args) {
        int ans = SoS(2,5);
        System.out.println(ans);
    }
    static int SoS(int n1, int n2){
        if(n1 == n2){
            return n1*n1;
        }
        else {
            int mid = (n1+n2)/2;
            return SoS(n1,mid) + SoS(mid+1,n2);
        }

    }
}
