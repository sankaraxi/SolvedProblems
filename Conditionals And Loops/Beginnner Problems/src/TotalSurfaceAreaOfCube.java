import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double side = in.nextDouble();
        System.out.printf("The total surface area of the Cube is %.3f", totalSurfaceAreaOfCube(side));
    }
    static double totalSurfaceAreaOfCube(double side){

        return 6*Math.pow(side,2);  //Math.PI gives the value of pi
        //return 6*side*side;
    }
}