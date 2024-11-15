public class skippingString {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(skipString(str));

    }
    static String skipString(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("Hello")){
            return skipString(str.substring(5));
        }else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
