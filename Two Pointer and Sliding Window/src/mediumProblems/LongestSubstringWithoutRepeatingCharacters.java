package mediumProblems;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }


// brute force
//    public static int lengthOfLongestSubstring(String s) {
//
//        int maxLen = 0;
//
//        for(int i = 0; i < s.length();i++){
//            int[] hashArray = new int[256];
//            int len = 0;
//            for(int j = i; j < s.length();j++){
//                if(hashArray[s.charAt(j)] == 1) break;
//
//                len = j - i + 1;
//                maxLen = Math.max(maxLen,len);
//
//                hashArray[s.charAt(j)] = 1;
//            }
//        }
//
//        return maxLen;
//    } // Time Complexity: O(n^2)
//    // Space Complexity: O(256) = O(1)

    public static int lengthOfLongestSubstring(String s) {
        int[] hashArray = new int[256];
        Arrays.fill(hashArray,-1);

        int l = 0;
        int r = 0;
        int maxLen = 0;
        int len;

        while (r < s.length()){
            len = 0;
            if (hashArray[s.charAt(r)] != -1){
                if (hashArray[s.charAt(r)] >= l){
                    l = hashArray[s.charAt(r)] + 1;
                }
            }

            len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hashArray[s.charAt(r)] = r;
            r++;
        }

        return maxLen;
    } // Time Complexity: O(n)
    // Space Complexity: O(256) = O(1)
}
