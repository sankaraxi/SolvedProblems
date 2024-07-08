package geeksforgeeks;

public class SumOfDivisors {
    public static void main(String[] args) {
        int N = 4;
        System.out.println(sumOfDivisors(N));
    }
    static long sumOfDivisors(int N){
        // code here
//        long outerSum = 0;
//        long innerSum = 0;
//        for(int i=1;i<=N;i++){
//            for(int j=1;j<=i;j++){
//                if (i%j==0){
//                    innerSum = innerSum + j;
//                }
//            }
//            outerSum = outerSum+innerSum;
//            innerSum=0;
//        }
//
//        return outerSum;
        //optimzed solution

        long totalSum = 0;

        // For each number i from 1 to N, we will determine how many times i is a divisor
        for (int i = 1; i <= N; i++) {
            totalSum = totalSum + (N / i) * i;
        }

        return totalSum;

    }
}
