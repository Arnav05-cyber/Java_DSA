package OOP.cloning;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human arnav = new Human(18,"Arnav");
        Human arnavTwin = (Human)arnav.clone();
    }
}
