package ownPatterns;
//             *
//            ***
//           *****
//          *******
//         *********
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            //printing spaces
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            //printing numbers
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }

            // without executing the below code we get the expected result sp it is optional
//            //printing spaces
//            for (int j = 1; j < n-i; j++) {
//                System.out.print(" ");
//            }

            System.out.println();
        }
    }
}
