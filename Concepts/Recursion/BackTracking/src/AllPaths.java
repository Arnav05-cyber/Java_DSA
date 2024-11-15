public class AllPaths {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        pathrestrictions("",arr,0,0);
    }

    static void pathrestrictions(String p, boolean[][] arr, int r, int c){
        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(p);
            return;
        }

        if(!arr[r][c]){
            return;
        }

        arr[r][c] = false;

        if(r<arr.length-1){
            pathrestrictions(p+"R",arr,r+1,c);
        }

        if(c<arr[0].length-1){
            pathrestrictions(p+"D",arr,r,c+1);
        }

        if(r>0){
            pathrestrictions(p+"U",arr,r-1,c);
        }
        if(c>0){
            pathrestrictions(p+"L",arr,r,c-1);
        }

        arr[r][c] = true;
    }
}
