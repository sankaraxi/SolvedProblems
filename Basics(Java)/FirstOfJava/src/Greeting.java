import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = in.next();
        greetMessage(name);
    }
    static void greetMessage(String name){
        System.out.println("Welcome to the world of CLasses and Objects, "+name+"!");
    }
}
