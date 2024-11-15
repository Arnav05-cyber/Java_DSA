package OOP;

public class Main {
    public static void main(String[] args) {
        student[] students = new student[5];

        student arnav = new student();
        arnav.marks = 99.99f;
        arnav.name = "Arnav";
        //arnav.rno = 12;
        //System.out.println(arnav.rno);


        student student2 = new student(13,"rhea",99.9f);
        System.out.println(student2.name);

        student random = new student(arnav);
        System.out.println(random.name);

        student random2 = new student();

        System.out.println(random2.name);

        student one = new student();
        student two = one;
        one.name = "something";
        System.out.println(two.name);
    }
}

class student{
    int rno = 10;
    float marks;
    String name;

    student(){
        this (15,"Default Person",100.0f);
    }

    student (student other){
        this.name  = other.name;
    }

    student(int rno, String name, float marks){
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }

}