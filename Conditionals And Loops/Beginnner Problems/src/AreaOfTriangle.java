import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base length of the triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = in.nextDouble();
        System.out.printf("The area of the Triangle is %.3f",areaOfTriangle(height,base));
        in.close();

    }

    static double areaOfTriangle(double height, double base){
        return (height*base)*1/2;
    }
}
