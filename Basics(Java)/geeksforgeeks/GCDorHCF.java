package geeksforgeeks;

public class GCDorHCF {
    public static void main(String[] args) {
        int A = 24;
        int B = 52;
        System.out.println(gcd(A, B));
    }

    private static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i < Math.min(a,b)+1; i++) {
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
