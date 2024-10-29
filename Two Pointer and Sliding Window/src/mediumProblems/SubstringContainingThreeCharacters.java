package mediumProblems;

public class SubstringContainingThreeCharacters {
    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        int[] hashArray = {-1,-1,-1};
        int count = 0;
        int index;

        for (int i = 0; i < s.length(); i++){
            index = s.charAt(i) - 'a';
            hashArray[index] = i;

            if (hashArray[0] != -1 && hashArray[1] != -1 && hashArray[2] != -1){
                count = count + (1 + Math.min(hashArray[0],Math.min(hashArray[1], hashArray[2])));
            }
        }

        return count;
    } // Time Complexity: O(n)
    // Space Complexity: O(1)

    // // brute
    // int[] hashArray = new int[3];
    // int count = 0;
    // int index;
    // for (int i = 0; i < s.length(); i++){
    //     Arrays.fill(hashArray,0);
    //     for(int j = i; j < s.length(); j++){
    //         index = s.charAt(j) - 'a';
    //         hashArray[index] = 1;

    //         if(hashArray[0] + hashArray[1] + hashArray[2] == 3){
    //             // count = count + 1;
    //             count = count + (s.length() - j);
    //             break;
    //         }
    //     }
    // }
    // return count;
    // // Time Complexity: O(n^2)
    // // Space Complexity: O(1)

    // most of the optimal solutions or derived from the above solution
}
