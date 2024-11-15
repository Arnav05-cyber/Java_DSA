import java.lang.reflect.Array;
import java.util.ArrayList;

public class TCSQuestion {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,4,6,7};
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = function(arr,k,list);
        System.out.println(ans);
    }
    static ArrayList function(int[] arr, int k, ArrayList list){
        int s = 0;
        int e = s + k;

        while((s<=e) && (e<=arr.length)){

            int max = 0;
            for (int i = s; i < e; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            list.add(max);
            s++;
            e++;
        }
        return list;
    }
}
