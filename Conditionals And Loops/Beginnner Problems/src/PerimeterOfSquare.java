import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = in.nextDouble();
        System.out.printf("The perimeter of the Square is %.3f", perimeterOfSquare(side));
    }
    static double perimeterOfSquare(double side){

        return 4*side;  //Math.PI gives the value of pi
    }
}