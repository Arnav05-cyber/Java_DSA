import java.util.ArrayList;

public class MazeQuesitons {
    public static void main(String[] args) {

        //int ans = backTracking2(3,3);
        //System.out.println(ans);
        pathprint("",3,3);
    }

    static int count = 0;
    static int pathCounting(int row, int col){

        if(row == 1 || col == 1){
            count++;
            return count;
        }

        int oneway = pathCounting(row-1,col);
        int secondway = pathCounting(row,col-1);
        return count;
    }

    static int pathcount(int row, int col){

        if(row == 1 || col == 1){
            return 1;
        }

        int oneway = pathcount(row-1,col);
        int secondway = pathcount(row,col-1);

        return oneway + secondway;
    }

    static void pathprint(String p ,int row, int col){

        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            pathprint(p+"R",row-1,col);
        }
        if(col > 1){
            pathprint(p+"D",row,col-1);
        }
    }

    static ArrayList<String> pathret(String p , int row, int col){

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(row > 1){
            list.addAll(pathret(p+"R",row-1,col));
        }
        if(col > 1){
            list.addAll(pathret(p+"D",row,col-1));
        }
        return list;
    }

    static void pathdiagnole(String p,int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r>1){
            pathdiagnole(p+"R",r-1,c);
        }
        if(c>1){
            pathdiagnole(p+"D",r,c-1);
        }
        if(r>1 && c>1){
            pathdiagnole(p+"Di",r-1,c-1);
        }
    }
}
