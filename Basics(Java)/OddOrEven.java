import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number to find Odd or Even: ");
        int num = in.nextInt();
        System.out.println(oddOrEven(num));
    }

    static String oddOrEven(int num) {
        if (num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
