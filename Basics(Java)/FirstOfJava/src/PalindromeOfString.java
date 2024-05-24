public class PalindromeOfString {
    public static void main(String[] args) {
        String str = "fal";
        System.out.println(palindrome(str));

    }
    static boolean palindrome(String text){
        //reversing the given string
        String nstr="";
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
        return nstr.equals(text);
    }
}
