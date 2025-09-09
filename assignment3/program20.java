import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double feetPerYard = 3.0;       
        double feetPerMile = 5280.0;    

        double yards = feet / feetPerYard;
        double miles = feet / feetPerMile;

        System.out.println("\nDistance Conversions:");
        System.out.println("In yards: " + yards + " yards");
        System.out.println("In miles: " + miles + " miles");

        sc.close();
    }
}
