package simpleProblems;
//https://leetcode.com/problems/string-to-integer-atoi
public class StringToInteger {
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0) return 0;
        long ans = 0;
        int sign = 1;
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;



        if(s.charAt(0)=='-') sign = -1;

        int i;
        i = (s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 : 0;

        while (i <s.length()){
            if (s.charAt(0) == ' ' || !Character.isDigit(s.charAt(i))) break;

            ans = ans * 10 + (s.charAt(i)-'0');
            if(sign == 1 && ans > MAX) return MAX;
            if(sign == -1 && -1*ans < MIN) return MIN;
            i++;
        }

        return (int)(ans*sign);

    }
}
