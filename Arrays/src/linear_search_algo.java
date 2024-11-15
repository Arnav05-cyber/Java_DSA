public class linear_search_algo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        search(arr, 0, 5,target);
    }
    static void search(int[] arr, int start, int end, int target){
        for(int i=start; i<end; i++){
            int e = arr[i];
            if (e == target){
                System.out.println(i);
            }
        }
    }
}
