public class DuplicateElemets {
    public static void main(String[] args) {
        int[] arr = {1,5,2,5,1};
        int ans = duplicateElements(arr);
        System.out.println(ans);
    }
    static int duplicateElements(int[] arr){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    c++;
                    System.out.println(arr[i]);
                }
            }
        }
        return c;
    }
}
