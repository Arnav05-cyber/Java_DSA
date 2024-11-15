public class SearchIn2dArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target = 8;
        search(arr,target);
    }
    static void search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col < arr[row].length;col++){
                if(target == arr[row][col]){
                    System.out.println("Row is "+row);
                    System.out.println("Col is "+col);
                }
            }
        }
    }
}
