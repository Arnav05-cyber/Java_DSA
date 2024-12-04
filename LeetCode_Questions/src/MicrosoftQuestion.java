public class MicrosoftQuestion {
    public static void main(String[] args) {
        String str = "zxyzxyz";
        System.out.println(function("",str));
    }
    static int function(String p, String up){
        if(p.isEmpty()){
            p = p + up.charAt(0);
            up = up.substring(1);

        }

        while(!up.isEmpty()){
            char ch = up.charAt(0);
            int c = 0;

            for (int i = 0; i < p.length(); i++) {

                if(p.charAt(i) == ch) {
                    c++;
                }
            }
            if(c == 0){
                p = p + ch;
            }

            up = up.substring(1);
        }
        System.out.println(p);
        return p.length();
    }
}
