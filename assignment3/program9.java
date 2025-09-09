import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the course fee (INR): ");
        double courseFee = sc.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountRate = sc.nextDouble();
        
        double discountAmount = (courseFee * discountRate) / 100;
        
        double discountedPrice = courseFee - discountAmount;
        
        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Discounted Price: INR " + discountedPrice);
        
        sc.close();
    }
}
