import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double height = in.nextDouble();
        System.out.printf("The volume of the Cone is %.3f",volumeOfcone(radius,height));
        in.close();
    }

    static double volumeOfcone(double radius, double height){
        return (1.0 /3)*Math.PI*radius*radius*height;
    }
}
