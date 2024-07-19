package geeksforgeeks;

public class PrintNnumbersRec {
    public static void main(String[] args) {
        int N = 4;
        printNos(N);
    }

    private static void printNos(int n) {
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n + " ");
        }
    }
}
