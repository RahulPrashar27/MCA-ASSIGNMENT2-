import java.util.Scanner;

public class program18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        double baseCm = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double heightCm = sc.nextDouble();

        double areaSqCm = 0.5 * baseCm * heightCm;

        double areaSqInches = areaSqCm / 6.4516;

        System.out.println("\nArea of the triangle:");
        System.out.println("In square centimeters: " + areaSqCm + " sq cm");
        System.out.println("In square inches: " + areaSqInches + " sq in");

        sc.close();
    }
}
