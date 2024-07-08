package geeksforgeeks;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int N = 133;
        System.out.println(isArmstrong(N));
    }
    static boolean isArmstrong(int N){
        int temp = N;
        int sum = 0;
        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == N) {
            return true;
        }else{
            return false;
        }
    }
}
