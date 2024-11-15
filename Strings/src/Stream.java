public class Stream {
    public static void main(String[] args) {
        skipA(" ","arnav");
        String ans = skipApart2("aaaaaaaaaaaaaaaaaaaaaaah");
        System.out.println(ans);
    }



    static void skipA(String pro, String unpro){
        if(unpro.isEmpty()){
            System.out.println(pro);
            return;
        }

        char ch = unpro.charAt(0);

        if (ch == 'a') {
            skipA(pro,unpro.substring(1));
        }
        else {
            skipA(pro + ch, unpro.substring(1));
        }

    }

    static String skipApart2(String unpro){
        if(unpro.isEmpty()){
            return "";
        }

        char ch = unpro.charAt(0);

        if (ch == 'a') {
            return skipApart2(unpro.substring(1));
        }
        else {
            return ch + skipApart2(unpro.substring(1));
        }

    }
}
