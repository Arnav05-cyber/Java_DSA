import java.util.Locale;

public class PalindrioneString {
    public static void main(String[] args) {
        String s = "abcdcb";
        System.out.println(isPalindrone(s));

    }
    static boolean isPalindrone(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start<end){
           if(s.charAt(start) != s.charAt(end)){
               return false;
           }
           else {
               start++;
               end--;
           }
        }
        return true;
    }
}
