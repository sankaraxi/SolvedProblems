package ownPatterns;
//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321
public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //printing numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            //printing space
            for (int j = 0; j < (2*n)-(i*2) ; j++) {
                System.out.print(" ");
            }
            //printing numbers
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
