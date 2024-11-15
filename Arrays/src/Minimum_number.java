public class Minimum_number {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        minimum(arr);
    }
    static void minimum(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
