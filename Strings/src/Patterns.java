public class Patterns {
    public static void main(String[] args) {
        Pattern9(4);
    }

    static void Pattern1(int n){

        for (int row = 1; row <=n; row++) {

            for (int col = 1; col <=row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void Pattern2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col=1; col<=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col<=n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n){
        for (int row = 1; row <=n; row++) {
            int r = 1;
            for (int col = 1; col <=row; col++) {
                System.out.print(r+" ");
                r++;
            }
            System.out.println();
        }
    }
    
    static void Pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row>n ? 2*n-row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row>n ? 2*n-row : row;
            int spaces = n-totalCols;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void Pattern7(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = n-row;
            for (int s = 0; s < spaces ; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");

            }
            for (int col = 2 ; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Pattern8(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalCols = row>n ? 2*n-row : row;

            for (int s = 0; s < n-totalCols; s++) {
                System.out.print("  ");
            }

            for (int col = totalCols; col >= 1; col--) {
                System.out.print(col + " ");

            }
            for (int col = 2 ; col <=totalCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row>n ? 2*n-row : row;
            int spaces = n-totalCols;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            for (int s = 0; s < 2*spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void Pattern10(int n){
        int originaln = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originaln - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
