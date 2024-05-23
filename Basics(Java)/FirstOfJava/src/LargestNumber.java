import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = in.nextInt();
        System.out.println("The Largest number is "+largestNumber(num1,num2)+".");

    }
    static int largestNumber(int num1, int num2){
        return Math.max(num1, num2);
        /*
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }
         */
    }
}
