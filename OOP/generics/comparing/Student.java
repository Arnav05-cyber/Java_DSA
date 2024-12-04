package OOP.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    int marks;

    public Student(int marks, int rollno) {
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
