package ownPatterns;
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
public class Pattern20 {
    public static void main(String[] args) {
        int n = 20;
        int initialSpace = 0;
        for (int i = 0; i < n; i++) {

            //printing stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            //printing spaces
            for (int j = 0; j < initialSpace ; j++) {
                System.out.print(" ");
            }

            //printing stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            initialSpace += 2;
            System.out.println();
        }

        initialSpace = initialSpace-2;

        for (int i = 0; i < n; i++) {
            //printing stars
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }

            //printing spaces
            for (int j = 0; j < initialSpace ; j++) {
                System.out.print(" ");
            }

            //printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            initialSpace -= 2;
            System.out.println();
        }
    }
}
