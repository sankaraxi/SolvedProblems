package geeksforgeeks;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        int temp = x;
        if (temp>=0){
            int ans= 0;
            while(temp!=0){
                ans = ans * 10 + temp % 10;
                temp/=10;
            }
            if (ans == x){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
