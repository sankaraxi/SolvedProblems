package ownPatterns;
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int initialSpace = 2*n - 2;
        for (int i = 1; i <= (2*n)-1; i++) { //totally nine rows
            //stars
            int stars = i;
            if (i>=n) stars = (2*n)-i ;
            for (int j = 1; j <=stars; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <=initialSpace; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i<n) initialSpace -= 2;
            else initialSpace += 2;
        }
    }
}
