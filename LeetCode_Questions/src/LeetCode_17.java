import java.util.ArrayList;

public class LeetCode_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23",""));
    }
    
    static ArrayList<String> letterCombinations(String un, String p){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = un.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(letterCombinations(un.substring(1),p+ch));
        }
        return ans;
    }
}
