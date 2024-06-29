package ownPatterns;
//E
//D E
//C D E
//B C D E
//A B C D E
public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n ; i++) {
            // also we can follow this way
            for (char ch =(char)('E'-i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
