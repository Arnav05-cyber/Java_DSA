public class Richest_banker {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1},
        };
        richest(arr);
    }

    static void richest(int[][] arr){
        int max = 0;
        for(int row = 0; row<arr.length; row++){
            int wealth = 0;
            for(int col = 0; col<arr[row].length; col++){
                wealth = arr[row][col] + wealth;
            }
            if(wealth>max){
                max = wealth;
            }
        }
        System.out.println(max);
    }
}
