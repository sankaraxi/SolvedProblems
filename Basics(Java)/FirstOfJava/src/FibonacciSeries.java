import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find fibonacci series: ");
        int num = in.nextInt();
        fibo(num);
    }
    static void fibo(int n){
        int first=0;
        int second =1;
        for (int i = 0; i <=n ; i++) {
            System.out.print(first+", ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
