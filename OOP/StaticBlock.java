package OOP;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a*4;
    }

    public static void main(String[] args) {
        StaticBlock sta = new StaticBlock();
        System.out.println(a + " " + b);
    }
}
