package basicProblems;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countSetBits(n));
    }

    public static int countSetBits(int n){

        // Your code here

//        int totalSetBits = 0;

        int  totalSetBits = 0;
        for (int i = 0; (1 << i) <= n; i++) {
            int powerOfTwo = 1 << i;
            int completePairs = n / (powerOfTwo * 2) * powerOfTwo;
            int remainder = n % (powerOfTwo * 2);
            int count_one_in_range = Math.max(0, remainder - powerOfTwo + 1);
            totalSetBits += completePairs + count_one_in_range;
        }

//        int current = 1;
//
//        while (current <= n){
//            int currentSetBits = 0;
//            int currentN = current;
//            while (currentN != 0){
//                currentN = currentN & (currentN - 1);
//                currentSetBits++;
//            }
//
//            totalSetBits += currentSetBits;
//            current++;
//        }
        return totalSetBits;
    }
}
