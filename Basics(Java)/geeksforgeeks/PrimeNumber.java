package geeksforgeeks;

public class PrimeNumber {
    public static void main(String[] args) {
        int N = 10;
//        System.out.println(isPrime(N));
        System.out.println(isPrimeOptimized(N));
    }

    private static boolean isPrimeOptimized(int n) {
        int divisorCount = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) { // for (int i = 1; i *i <= n; i++)
            // say n is equal to 36, it will run upto i = 6 which gives 36 by squaring it
                if(n%i==0) {
                    divisorCount++;
                    if (n % i != i) {
                        divisorCount++;
                    }
                }
        }

        return divisorCount == 2; //it returns true if the number is prime or else false

    }

//    private static boolean isPrime(int n) {
//
//        int divisorCount = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if(n%i==0){
//                divisorCount++;
//            }
//        }
//
//        return divisorCount == 2;
//    }


}
