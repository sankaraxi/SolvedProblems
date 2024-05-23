import java.util.Scanner;

public class SampleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principal = in.nextInt();
        System.out.print("Enter the Time Taken in Years: ");
        int time = in.nextInt();
        System.out.print("Enter the Rate of Interest: ");
        int rate = in.nextInt();
        System.out.print("Simple Interest is "+simpleInterest(principal,time,rate)+".");
    }
    static int simpleInterest(int princi, int time, int rate){
        return (princi*time*rate)/100;
    }
}
