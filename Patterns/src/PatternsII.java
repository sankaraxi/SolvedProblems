public class PatternsII {
    public static void main(String[] args) {
//        pattern28(5);
//        pattern30(5);
//        pattern17(5);
        pattern31(5);
    }
    static void pattern28(int n) {
        for (int row = 1; row < 2 * n ; row++) {
            int totalColsInRow = (row > n) ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <=5; row++) {
            int noOfSpaces = n - row;
            for (int i = 0; i <= noOfSpaces ; i++) {
                System.out.print("  ");
            }

            for (int i = row; i >=1 ; i--) {
                System.out.print(i+" ");
            }
            for (int i = 2; i <=row ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = (row > n) ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int i = 0; i <= noOfSpaces; i++) {
                System.out.print("  ");
            }

            for (int i = totalColsInRow; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= totalColsInRow; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN =n;
        n = 2*n;
        for (int row = 1; row <n; row++) {
            for (int col = 1; col <n ; col++) {
                int atEveryIndex = originalN- Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
