import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextDouble();
        System.out.printf("The area of the Circle is %.3f",areaOfCircle(radius));
    }
    static double areaOfCircle(double radius){
        return Math.PI*radius*radius;  //Math.PI gives the value of pi
    }
}