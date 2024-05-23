import java.util.Scanner;

public class USDConvertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount in INR: ");
        int inr = in.nextInt();
        System.out.print("Your Amount in USD is $"+ USDConvertor(inr));
    }
    static float USDConvertor(float inr){
        return inr*0.0120091269364717f;
    }
}
