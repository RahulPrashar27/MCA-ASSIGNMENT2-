public class program4 {
    public static void main(String[] args) {
        double costPrice = 129;   
        double sellingPrice = 191; 

        double profitOrLoss = sellingPrice - costPrice; 
        double percentage;

        if (profitOrLoss > 0) {
            
            percentage = (profitOrLoss / costPrice) * 100;
            System.out.println("Profit: INR " + profitOrLoss);
            System.out.println("Profit Percentage: " + percentage + "%");
        } else if (profitOrLoss < 0) {
            
            percentage = (Math.abs(profitOrLoss) / costPrice) * 100;
            System.out.println("Loss: INR " + Math.abs(profitOrLoss));
            System.out.println("Loss Percentage: " + percentage + "%");
        } else {
            
            System.out.println("No Profit, No Loss.");
        }
    }
}
