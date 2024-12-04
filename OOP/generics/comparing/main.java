package OOP.generics.comparing;

public class main{

    public static void main(String[] args) {
        Student arnav = new Student(35,12);
        Student rhea = new Student(90,13);

        if(arnav.compareTo(rhea) < 0){
            System.out.println("Rhea is smarter");
        }
    }

}
