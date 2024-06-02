import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side1 length of the triangle: ");
        double side1 = in.nextDouble();
        System.out.print("Enter the side2 length of the triangle: ");
        double side2 = in.nextDouble();
        System.out.print("Enter the side3 length of the triangle: ");
        double side3 = in.nextDouble();
        System.out.printf("The area of the Triangle is %.3f", perimeterOfTriangle(side1,side2,side3));
        in.close();

    }

    static double perimeterOfTriangle(double side1, double side2,double side3){

        return side1+side2+side3;
    }
}
