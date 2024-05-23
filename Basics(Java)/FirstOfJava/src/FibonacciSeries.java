import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find fibonacci series: ");
        int num = in.nextInt();
        System.out.println(fibo(num));
    }
    static List<Integer> fibo(int n){
        int prev=0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            int current = i;
            prev = prev + current;
            ans.add(prev);
        }
        return ans;
    }
}
