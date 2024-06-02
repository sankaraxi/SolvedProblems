import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = in.nextDouble();
        System.out.printf("The area of the Rectangle is %.3f", areaOfRectangle(length,breadth));
        in.close();

    }

    static double areaOfRectangle(double length, double breadth){
        return length*breadth;
    }
}
