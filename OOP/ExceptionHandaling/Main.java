package OOP.ExceptionHandaling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            throw new myException("This is custom exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Default");
        }

    }
}
