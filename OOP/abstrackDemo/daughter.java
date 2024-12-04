package OOP.abstrackDemo;

public class daughter extends Parent{

    public daughter(int age){
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I will become" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " he is " + age);
    }
}
