import java.util.Arrays;

public class printMaxtrixPaths {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        int[][] path = new int[arr.length][arr[0].length];
        int step=1;

        allPathPrint("",arr,0,0,path,step);
    }

    static void allPathPrint(String p, boolean[][] arr, int r, int c,int[][] path, int step){
        if(r == arr.length-1 && c == arr[0].length-1){
            path[r][c] = step;
            for(int[] arr2 : path){
                System.out.println(Arrays.toString(arr2));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!arr[r][c]){
            return;
        }

        arr[r][c] = false;
        path[r][c] = step;

        if(r<arr.length-1){
            allPathPrint(p+"D",arr,r+1,c,path,step+1);
        }

        if(c<arr[0].length-1){
            allPathPrint(p+"R",arr,r,c+1,path,step+1);
        }

        if(r>0){
            allPathPrint(p+"U",arr,r-1,c,path,step+1);
        }
        if(c>0){
            allPathPrint(p+"L",arr,r,c-1,path,step+1);
        }
        path[r][c] = 0;
        arr[r][c] = true;
    }
}
