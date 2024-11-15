import java.util.Arrays;

public class StrictlySorted2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,5,6},
                {7,8,9},
        };
        int target = 2;

        int ans[] = binarySearch(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    static int[] binarySearch(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if(rows == 1){
            return simpleBinarySearch(arr,0,0,cols-1,target);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols/2;
        while(rstart<(rend-1)){
            int mid = rstart + (rend-rstart)/2;
            if(arr[mid][cmid] == target){
                return new int[]{mid,cmid};
            } else if (arr[mid][cmid]>target) {
                rend = mid;
            }
            else if (arr[mid][cmid]<target){
                rstart = mid;
            }
        }

        if(target == arr[rstart][cmid]){
            return new int[]{rstart,cmid};
        }
        if(target == arr[rstart+1][cmid]){
            return new int[]{rstart+1,cmid};
        }

        if(target<=arr[rstart][cmid-1]) {
            return simpleBinarySearch(arr, rstart, 0, cmid - 1, target);
        }
        if(target>=arr[rstart][cmid+1]&&target<=arr[rstart][cols-1]){
            return simpleBinarySearch(arr,rstart,cmid+1,cols-1,target);
        }
        if(target<=arr[rstart+1][cmid-1]){
            return simpleBinarySearch(arr,rstart+1,0,cmid-1,target);
        }
        if (target >= arr[rstart+1][cmid+1]&&target<=arr[rstart+1][cols-1]) {
            return simpleBinarySearch(arr,rstart+1,cmid+1,cols-1,target);
        }

        return new int[]{-1,-1};
    }
    static int[] simpleBinarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(target == arr[row][mid]){
                return new int[]{row,mid};
            }
            if(target<arr[row][mid]){
                cEnd = mid-1;
            }
            else{
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }


}
