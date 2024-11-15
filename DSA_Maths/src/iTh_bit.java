

public class iTh_bit {
    public static void main(String[] args) {
        int a = 20;
        int ithbit = 5;
        int ans = bitFinder(a,ithbit);
        System.out.println(ans);
    }

    private static int bitFinder(int a, int ithbit) {
        return a & (1<<(ithbit-1));
    }


}
