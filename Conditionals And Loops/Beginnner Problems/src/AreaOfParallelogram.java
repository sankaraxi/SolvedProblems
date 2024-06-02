import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the parallelogram: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = in.nextDouble();
        System.out.printf("The area of the Parallelogram is %.3f", areaOfRectangle(base,height));
        in.close();

    }

    static double areaOfRectangle(double base, double height){
        
        return base*height;
    }
}
