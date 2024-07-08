package geeksforgeeks;

public class ReverseANumber {
    public static void main(String[] args) {
        int x = -1539;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        String str = String.valueOf(x);
        if (str.charAt(0) == '-'){
            int temp = x*-1;
            long reverse = 0;
            while (temp!=0){
                int digit = temp % 10;
                reverse = reverse*10 + digit;
                temp/=10;
            }
            return (reverse<Integer.MIN_VALUE) ? 0 : (int) reverse*-1;
        }else if (x==0) {
            return 0;
        }else{
            int temp = x;
            long reverse = 0;
            while (temp!=0){
                int digit = temp % 10;
                reverse = reverse*10 + digit;
                temp/=10;
            }
            return (reverse > Integer.MAX_VALUE) ? 0 : (int) reverse;
        }

    }
}
