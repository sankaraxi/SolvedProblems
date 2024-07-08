package geeksforgeeks;

public class ReverseANumber {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        String str = String.valueOf(x);
        if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
            if (str.charAt(0) == '-'){
                int temp = x*-1;
                int reverse = 0;
                while (temp!=0){
                    int digit = temp % 10;
                    reverse = reverse*10 + digit;
                    temp/=10;
                }
                return reverse*-1;
            }else if (x==0) {
                return 0;
            }else{
                int temp = x;
                int reverse = 0;
                while (temp!=0){
                    int digit = temp % 10;
                    reverse = reverse*10 + digit;
                    temp/=10;
                }
                return reverse;
            }
        }else{
            return 0;
        }

    }
}
