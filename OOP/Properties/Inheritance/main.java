package OOP.Properties.Inheritance;

import OOP.access.A;

public class main {
    public static void main(String[] args) {
        Box box1 = new Box(6,5,7);
        Box box2 = new Box(box1);
        //System.out.println(box2.l + "-l " + box2.w + "-w " + box2.h + "-h ");

        BoxWeight box3 = new BoxWeight(2,3,4,5);
        System.out.println(box3.l + "-l, " + box3.w + "-w, " + box3.h + "-h, " + box3.weight + "-weight ");


        Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5.w);

        BoxWeight box6 = new BoxWeight(4,2);

        BoxDensity box7 = new BoxDensity(2,3,4,5,6);

        BoxDensity box8 = new BoxDensity(2,4,5);

        BoxDensity defaultBox = new BoxDensity();

        System.out.println(defaultBox.w + " " + defaultBox.density);

        A a = new A(45,"Varun");
        a.getNum();
    }
}
