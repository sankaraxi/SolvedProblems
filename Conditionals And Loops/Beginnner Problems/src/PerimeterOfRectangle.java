import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = in.nextDouble();
        System.out.printf("The Perimeter of the Rectangle is %.3f", perimeterOfRectangle(length,breadth));
        in.close();

    }

    static double perimeterOfRectangle(double length, double breadth){

        return 2*(length+breadth);
    }
}
