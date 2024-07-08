package geeksforgeeks;

import java.lang.reflect.Array;

public class CountDigits {
    public static void main(String[] args) {
        int N = 2446;

        System.out.println(evenlyDivides(N));
    }

    static int evenlyDivides(int N){
        // code here
        int count = 0;
        int temp = N;
        while (temp > 0) {
            int digit = temp % 10;
            if ( digit!=0 && N % digit == 0) {
                count++;
            }
            temp /= 10;
        }

        return count;
    }
}
