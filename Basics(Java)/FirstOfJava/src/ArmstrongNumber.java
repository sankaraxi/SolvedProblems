import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        int num = 370;
        // program to print the armstrong numbers between two numbers
        System.out.println(armstrong(0,999));
    }
    //sum of cubes of individual digits should be equal to the given digit
    static List<Integer> armstrong(int start, int end){
        List<Integer> ans = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            int sum = 0;
            int div =i;
            while(div>0){
                int rem =div % 10;
                int cube = rem * rem * rem;
                sum = sum+cube;
                div =div/10;
            }
            if (sum == i){
                ans.add(sum);
            }
        }
        return ans;
    }
}
