import java.lang.reflect.Array;

public class LeetCode_153 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int s = 0;
        int e = arr.length-1;

        //check to see if arr is of one element

        if(arr.length == 1){
            return arr[s];
        }

        //check 1
        if(arr[s]<arr[e]){
            return arr[s];
        }

        //check 2
        if(arr[s] > arr[e]){
            //arr is rotated
            if(arr.length == 2){
                return arr[1];
            }
            return rotatedBS(arr);
        }
        return -1;
    }

    static int rotatedBS(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = (e+s)/2;

            //check to see if mid is pivot

            if((arr[mid]>arr[mid+1]) && (arr[mid]>arr[mid-1])){
                return arr[mid+1];
            }
            //check to see if mid is minimum element

            if((arr[mid]<arr[mid+1]) && (arr[mid]<arr[mid-1])){
                return arr[mid];
            }

            //check to see where mid lies

            if(arr[mid] > arr[s]){
                s = mid;
            }

            if(arr[mid] < arr[s]){
                e = mid;
            }
        }
        return -1;
    }
}
