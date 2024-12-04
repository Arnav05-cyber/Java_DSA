package NeetCode150;

import java.util.ArrayList;
import java.util.Arrays;

public class TopKFrequentEle {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,3};
        int k = 2;

        System.out.println(sol(arr,k));
    }

    static ArrayList<Integer> sol(int[] arr, int k){
        Arrays.sort(arr);
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    c++;
                }
            }
            if(c == k){
                list.add(arr[i]);
            }
            c = 0;
        }
        return list;
    }
}
