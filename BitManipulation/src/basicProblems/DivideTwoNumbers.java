package basicProblems;
//https://leetcode.com/problems/divide-two-integers/
public class DivideTwoNumbers {
    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;
        System.out.println(divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("Division by zero");
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean sign = (dividend > 0) == (divisor > 0);

        long numerator = Math.abs((long) dividend);
        long denominator = Math.abs((long) divisor);
        int ans = 0;

        while (numerator >= denominator) {
            int count = 0;
            while (numerator >= (denominator << (count + 1))) {
                count++;
            }
            ans += (1 << count);
            numerator -= (denominator << count);
        }

        return sign ? ans : -ans;
    }
}
