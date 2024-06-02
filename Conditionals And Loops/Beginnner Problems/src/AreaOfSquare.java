import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = in.nextDouble();
        System.out.printf("The area of the Square is %.3f", areaOfSquare(side));
    }
    static double areaOfSquare(double side){

        return side*side;  //Math.PI gives the value of pi
    }
}