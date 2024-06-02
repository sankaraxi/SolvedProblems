import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = in.nextDouble();
        System.out.printf("The volume of the Cylinder is %.3f", volumeOfCylinder(radius,height));
        in.close();

    }

    static double volumeOfCylinder(double radius, double height){

        return Math.PI*Math.pow(radius,2)*height;
    }
}
