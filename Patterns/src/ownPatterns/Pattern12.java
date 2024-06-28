package ownPatterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <n; i++) {
            //printing numbers
            for (int j = 0; j <=i ; j++) {
                System.out.print(j+1);
            }
            //printing space
            for (int j = 0; j <(n+2)-(2*i) ; j++) {
                System.out.print(" ");
            }
            //printing numbers
            for (int j = i+1; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
