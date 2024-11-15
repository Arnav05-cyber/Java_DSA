public class CountZeros {
    public static void main(String[] args) {
        int n = 302045;
        int count = 0;
        int ans = countZerosWay2(n,count);
        System.out.println(ans);
        //countZeros(n);
        //System.out.println(c);
    }

    static int c = 0;
    static void countZeros(int n){
        int rem = 0;
        if(n == 0){
            return;
        }
        rem = n%10;

        if(rem == 0){
            c++;
        }
        countZeros(n/10);

    }

    static int countZerosWay2(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;

        if(rem == 0){
             return countZerosWay2(n/10,++count);
        }
        else {
            return countZerosWay2(n/10,count);
        }

    }
}
