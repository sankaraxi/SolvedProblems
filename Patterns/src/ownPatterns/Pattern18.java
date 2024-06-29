package ownPatterns;
//         A
//        ABA
//       ABCBA
//      ABCDCBA
//     ABCDEDCBA
public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            //printing spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //printing characters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1 ; j <=2*i + 1 ; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}
