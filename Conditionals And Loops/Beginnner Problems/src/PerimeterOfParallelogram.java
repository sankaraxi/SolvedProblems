import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the parallelogram: ");
        double base = in.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = in.nextDouble();
        System.out.printf("The perimeter of the Parallelogram is %.3f", perimeterOfParallelogram(base,height));
        in.close();

    }

    static double perimeterOfParallelogram(double base, double height){
        
        return 2*(base+height);
    }
}
