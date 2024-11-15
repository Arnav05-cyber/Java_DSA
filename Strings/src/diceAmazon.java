public class diceAmazon {
    public static void main(String[] args) {
        int target = 4;
        dice("",6);

    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }
}
