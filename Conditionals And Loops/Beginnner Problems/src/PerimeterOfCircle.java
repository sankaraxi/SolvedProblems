import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextDouble();
        System.out.printf("The Perimeter of the Circle is %.3f", perimeterOfCircle(radius));
    }
    static double perimeterOfCircle(double radius){

        return 2*Math.PI*radius;  //Math.PI gives the value of pi
    }
}