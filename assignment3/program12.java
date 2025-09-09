import java.util.Scanner;

public class program12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        double areaInSqInches = 0.5 * base * height;

        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println("\nArea of the triangle:");
        System.out.println("In square inches: " + areaInSqInches + " sq in");
        System.out.println("In square centimeters: " + areaInSqCm + " sq cm");

        sc.close();
    }
}
