package geeksforgeeks;
// https://leetcode.com/problems/valid-palindrome/
public class PalindromeStrings {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String str = s.replaceAll("([,:\\s]+)",""); //remove all the special characters
//        str = str.toLowerCase();
//        System.out.println(str);
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        String str = s.replaceAll("([\\p{Punct}\\s]+)",""); // remove all the special characters
        str = str.toLowerCase();

//        String nstr="";
//        char ch;
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            nstr=ch+nstr;
//        }
//        return nstr.equals(str);


        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
