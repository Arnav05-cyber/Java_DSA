import java.util.Arrays;

public class BinarySearch2dArray_RowColumnSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1},
                {3}
        };
        int target = 1;
        int[] ans = binarySearch2dArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch2dArray(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;
        int cstart = 0;
        int cend = arr[0].length-1;


        if(arr.length == 1 && arr[r][cstart] == target){
            return new int[]{r,cstart};
        }
        if(arr.length==1){
            while(cstart<=cend){
                int mid = cstart+(cend-cstart)/2;
                if(arr[0][mid] == target){
                    return new int[]{r,mid};
                }
                else if(target<arr[0][mid]){
                    cend = mid-1;
                }
                else if(arr[0][mid]<target){
                    cstart = mid+1;
                }
            }
        }
        while(r<arr.length && c>0 && arr[r].length>1){
            if(target>arr[r][c]){
                r++;
            }
            else if(target<arr[r][c]){
                c--;
            }
            else{
                return new int[]{r,c};
            }
        }

        return new int[]{-1,-1};
    }
}
