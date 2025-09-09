import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int dividend = sc.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        sc.close();
    }
}
