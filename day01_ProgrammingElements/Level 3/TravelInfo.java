import java.util.Scanner;

public class TravelInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        String fromCity = scanner.nextLine();
        String viaCity = scanner.nextLine();
        String toCity = scanner.nextLine();
        
        double fromToVia = scanner.nextDouble();
        double viaToFinalCity = scanner.nextDouble();
        double timeFromToVia = scanner.nextDouble();
        double timeViaToFinalCity = scanner.nextDouble();
        
        double totalDistance = (fromToVia + viaToFinalCity) * 1.60934;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
