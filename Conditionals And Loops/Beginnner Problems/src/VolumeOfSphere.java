import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = in.nextDouble();
        System.out.printf("The area of the Square is %.3f", volumeOfSphere(radius));
    }
    static double volumeOfSphere(double radius){

        return Math.PI*Math.pow(radius,3)*(4.0/3);  //Math.PI gives the value of pi
    }
}