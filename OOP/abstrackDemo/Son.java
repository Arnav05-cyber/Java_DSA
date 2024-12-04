package OOP.abstrackDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + "she is " + age);
    }
}
