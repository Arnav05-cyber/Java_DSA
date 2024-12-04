package OOP.Properties.Polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();

        circle.area();
    }

}
