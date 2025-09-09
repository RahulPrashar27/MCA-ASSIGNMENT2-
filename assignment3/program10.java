import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        
        double cmToInch = 0.393701; 
        int inchPerFoot = 12;       

        
        double totalInches = heightCm * cmToInch;

        
        int feet = (int) (totalInches / inchPerFoot);
        double inches = totalInches % inchPerFoot;

        System.out.println("Your height is: " + feet + " feet and " + String.format("%.2f", inches) + " inches.");

        sc.close();
    }
}
