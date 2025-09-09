public class program7 {
    public static void main(String[] args) {
        double radiusKm = 6371;             
        double kmToMiles = 0.621371;        

        
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        
        double radiusMiles = radiusKm * kmToMiles;

    
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("Volume of Earth:");
        System.out.println("In cubic kilometers: " + volumeKm3 + " km³");
        System.out.println("In cubic miles: " + volumeMiles3 + " mi³");
    }
}
