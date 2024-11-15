import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 4;
        int ans = linearSearch(arr,target,0);
        //System.out.println(ans);
        //System.out.println(findIfInArray(arr,target,0));
        findAlloccurances(arr,target,0);
        System.out.print(list);

    }
    static int linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return linearSearch(arr,target,index+1);
        }
    }

    static boolean findIfInArray(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findIfInArray(arr,target,index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAlloccurances(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAlloccurances(arr,target,index+1);

    }
}
