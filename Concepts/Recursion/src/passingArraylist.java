import java.util.ArrayList;

public class passingArraylist {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int target = 3;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(Search(arr, target, 0, list));

    }

    static ArrayList Search(int[] arr, int target, int index, ArrayList list) {
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return Search(arr, target, index + 1, list);
    }
}
