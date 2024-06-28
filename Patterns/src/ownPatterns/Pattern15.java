package ownPatterns;
//A B C D E
//A B C D
//A B C
//A B
//A

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {
//            int alpha = 65;
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print((char)alpha + " ");
//                alpha = alpha + 1;
//            }

            // also we can follow this way
            for (char ch = 'A'; ch <= 'A'+(n-i); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
