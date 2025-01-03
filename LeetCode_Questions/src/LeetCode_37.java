public class LeetCode_37 {
    public static void main(String[] args) {
        int[][] board = {
                {0,6,2,0,0,7,5,8,3},
                {9,7,5,4,8,0,1,0,6},
                {1,3,8,0,6,2,0,4,7},
                {0,5,3,0,0,0,8,6,0},
                {0,4,9,0,7,8,0,0,0},
                {5,0,0,0,9,0,7,0,0},
                {3,2,7,0,0,4,0,0,0},
                {8,0,0,0,0,6,0,1,0},
                {0,0,0,8,3,9,0,7,0},
        };

        if(solve(board)){
            display(board);
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int r = -1;
        int c = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    r = i;
                    c = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft == false){
                break;
            }
        }
        if(emptyLeft == true){
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,r,c,number)){
                board[r][c] = number;
                if(solve(board)){
                    return true;
                }
                else {
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){

        for (int i = 0; i < board.length; i++) {
            if(board[row][col] == num){
                return false;
            }
        }

        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int start = row-row%sqrt;
        int colstart = col-col%sqrt;

        for (int r = start; r < start+sqrt; r++) {
            for (int c = colstart; c < colstart+sqrt; c++) {
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
