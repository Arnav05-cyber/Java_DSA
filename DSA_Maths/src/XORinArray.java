public class XORinArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        int ans = uniqueElement(arr);
        System.out.println(ans);
    }
    static int uniqueElement(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique = unique ^ n;
        }

        return unique;
    }
}
