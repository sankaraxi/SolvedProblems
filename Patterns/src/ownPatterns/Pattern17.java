package ownPatterns;
//          A
//         ABC
//        ABCDE
//       ABCDEFG
//      ABCDEFGHI
public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char condition1 = (char) ('A' + (2*i) - 1);
            //printing spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //printing characters
            for (char ch = 'A'; ch < condition1 ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
