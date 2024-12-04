import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_54 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(func(arr));
    }
    static List<Integer> func(int[][] arr){
        int rowB = 0;
        int rowE = arr.length-1;
        int colB = 0;
        int colE = arr[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(rowB<=rowE && colB<= colE){
            for(int i = colB; i<= colE; i++){
                list.add(arr[rowB][i]);
            }
            rowB++;

            for (int i = rowB; i <= rowE ; i++) {
                list.add(arr[i][colE]);
            }
            colE--;

            if(rowB<=rowE){
                for (int i = colE; i >= colB ; i--) {
                    list.add(arr[rowE][i]);
                }

            }
            rowE--;

            if(colB<=colE){
                for (int i = rowE; i >= rowB ; i--) {
                    list.add(arr[i][colB]);
                }

            }
            colB++;
        }
        return list;
    }
}
