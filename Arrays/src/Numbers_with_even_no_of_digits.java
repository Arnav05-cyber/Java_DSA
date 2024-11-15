public class Numbers_with_even_no_of_digits {
    public static void main(String[] args) {
        int[] nums = {-23,455,12,567,2345};

        evendigits(nums);
    }

    static void evendigits(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int j=arr[i];
            int t = j;
            int f = 0;
            if(t<0){
                t = t*-1;
            }
            while (t>0){
                int d = t%10;
                f = f+1;
                t = t/10;
            }
            if(f%2 == 0){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
