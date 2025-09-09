public class program3 {
    public static void main(String[] args) {
        double kilometers = 10.8;          
        double conversionFactor = 0.621371; 
        
        double miles = kilometers * conversionFactor; 
        
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
