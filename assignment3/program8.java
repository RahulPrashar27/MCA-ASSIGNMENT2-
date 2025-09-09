import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        
        double kmToMiles = 0.621371;
        
        double miles = kilometers * kmToMiles;
        
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        sc.close();
    }
}

