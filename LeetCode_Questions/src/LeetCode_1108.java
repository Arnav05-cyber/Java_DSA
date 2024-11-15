public class LeetCode_1108 {
    public static void main(String[] args) {
        String str = "100.234.12.1";

        System.out.println(defangIPaddr(str));

    }
    static String defangIPaddr(String str){
        int len = str.length();
        String newStr = "";

        for (int i = 0; i < len; i++) {
            if(str.charAt(i) == '.'){
               newStr = str.replace(".","[.]");
            }
            
        }
        return newStr;
    }
}
