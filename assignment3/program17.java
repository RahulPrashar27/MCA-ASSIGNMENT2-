import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        Double quotient = null; 

        if (num2 != 0) {
            quotient = num1 / num2;
        }

        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (quotient != null) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        sc.close();
    }
}
