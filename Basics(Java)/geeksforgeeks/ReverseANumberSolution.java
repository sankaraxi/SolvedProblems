package geeksforgeeks;

public class ReverseANumberSolution {
    public static void main(String[] args) {
        int x = -5342;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }
}
