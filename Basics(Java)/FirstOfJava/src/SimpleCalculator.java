import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the operator to perform operations(+, -, *, /): ");
        char op = in.next().charAt(0);
        System.out.print("Enter the number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = in.nextInt();
        System.out.print("Answer is "+calculate(op,num1,num2));
    }

    static int calculate(char op, int num1, int num2){
        if (op == '+'){
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;
        } else if (op == '*') {
            return num1 * num2;
        } else{
            return num1 / num2;
        }
    }
}
