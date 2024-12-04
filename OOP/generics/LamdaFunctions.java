package OOP.generics;
import java.util.ArrayList;

public class LamdaFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        //list.forEach((item)-> System.out.println(item*2));
        Operation sum = ((a,b)->a+b);
        Operation sub = ((a,b)->a-b);
        Operation multi = ((a,b)->a*b);

        int ans = operate(5,4,sum);
        System.out.println(ans);
    }

    private static int operate(int a, int b, Operation op){
        return op.operation(a ,b);
    }
}

interface Operation {
    int operation(int a, int b);
}
