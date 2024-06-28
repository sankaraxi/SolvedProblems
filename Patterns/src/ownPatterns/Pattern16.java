package ownPatterns;
//A
//BB
//CCC
//DDDD
//EEEEE
public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        int alpha = 65;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)alpha);
            }
            alpha = alpha + 1;

//            // also we can follow this way
//            for (char ch = 'A'; ch < 'A'+i; ch++) {
//                System.out.print(ch + " ");
//            }
            System.out.println();
        }
    }
}
