public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "yy";
        System.out.println(nonRepeatingChar(s));

    }
    static char nonRepeatingChar(String s) {
        // Your code here
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length -1;

        while (i<j){
            if(arr[i] == arr[j]){
                i++;
                j = arr.length-1;
            }else{
                j--;
            }

            if(i!= arr.length-1 && i == j) return arr[i];
        }

        return '$';
    }
}
