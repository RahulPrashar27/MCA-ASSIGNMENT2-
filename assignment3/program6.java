public class program6 {
    public static void main(String[] args) {
        double courseFee = 125000;  
        double discountRate = 10;   

        
        double discountAmount = (courseFee * discountRate) / 100;

        
        double discountedPrice = courseFee - discountAmount;

        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Discounted Price: INR " + discountedPrice);
    }
}
