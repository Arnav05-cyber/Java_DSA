import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(subsequence2("pwwkew",""));

    }

    static void subsequence(String unpro, String proc){
        if(unpro.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unpro.charAt(0);

        subsequence(unpro.substring(1),proc+ch);
        subsequence(unpro.substring(1),proc);
    }

    static ArrayList<String> subsequence2(String unpro, String proc){
        if(unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        char ch = unpro.charAt(0);

        ArrayList<String> left = subsequence2(unpro.substring(1),proc+ch);
        ArrayList<String> right = subsequence2(unpro.substring(1),proc);

        left.addAll(right);
        return left;
    }
}
