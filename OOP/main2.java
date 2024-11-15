package OOP;
import OOP.Human;

import java.sql.SQLOutput;

public class main2 {
    public static void main(String[] args) {
        Human arnav = new Human(18,"Arnav",0);
        Human rhea = new Human(18,"Rhea",10);

        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();


    }
    static void fun(){
        main2 obj = new main2();
        obj.greeting();
    }

    void greeting(){
        System.out.println("Hello");
    }

}
