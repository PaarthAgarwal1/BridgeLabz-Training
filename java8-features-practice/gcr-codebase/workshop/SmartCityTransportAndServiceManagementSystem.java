
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface TransportService{
    String getName();
    String getRoute();
    double getFare();
    int getDepartureTime();
    default void printServiceDetails(){
        System.out.println(getName() + " | Route: " + getRoute()+ " | Fare: " + getFare()+ " | Departure: " + getDepartureTime());
    }
}
interface GeoUtils{
    static double calculateDistance(double start,double end){
        return Math.abs(end-start);
    }
}
@FunctionalInterface
interface FareCalculator{
    double calculateFare(double distance);
}
interface EmergencyService{

}

class BusService implements TransportService{
    public String getName(){
        return "Bus";
    }
    public String getRoute(){
        return "A-B";
    }
    public double getFare(){
        return 30;
    }
    public int getDepartureTime(){
        return 9;
    }
}

class MetroService implements TransportService{
    public String getName(){
        return "Metro";
    }
    public String getRoute(){
        return "A-C";
    }
    public double getFare(){
        return 50;
    }
    public int getDepartureTime(){
        return 8;
    }
}
class TaxiService implements TransportService{
    public String getName(){
        return "Bus";
    }
    public String getRoute(){
        return "B-c";
    }
    public double getFare(){
        return 120;
    }
    public int getDepartureTime(){
        return 7;
    }
}
class AmbulanceService implements TransportService,EmergencyService{
    public String getName(){
        return "Ambulance";
    }
    public String getRoute(){
        return "Ambulance-route";
    }
    public double getFare(){
        return 0;
    }
    public int getDepartureTime(){
        return 0;
    } 
}

class Passenger {
    String route;
    double fare;
    boolean peakTime;

    Passenger(String route, double fare, boolean peakTime) {
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }
}
public class SmartCityTransportAndServiceManagementSystem {
    public static void main(String[] args) {
        List<TransportService> service=Arrays.asList(new BusService(),new MetroService(),new TaxiService(),new AmbulanceService());
        List<Passenger> passengers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SMART CITY DASHBOARD =====");
            System.out.println("1. View All Services");
            System.out.println("2. Book a Trip");
            System.out.println("3. View Emergency Services");
            System.out.println("4. Revenue Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    service.forEach(TransportService::printServiceDetails);
                    break;
                case 2:
                    System.out.print("Enter Route (A-B / A-C / B-C): ");
                    String route = sc.next();

                    System.out.print("Peak Time? (true/false): ");
                    boolean peak = sc.nextBoolean();
                    List<TransportService> matchServices=service.stream().filter(s->s.getRoute().equalsIgnoreCase(route)).collect(Collectors.toList());
                    System.out.println("Sort by: 1. Lowest Fare | 2. Earliest Departure");
                    int pref=sc.nextInt();
                    if(pref==1){
                        matchServices.sort(Comparator.comparingDouble(TransportService::getFare));
                    }else{
                        matchServices.sort(Comparator.comparingInt(TransportService::getDepartureTime));
                    }
                    matchServices.forEach((TransportService::printServiceDetails));
                    FareCalculator calculator=distance -> distance*10;
                    System.out.println("Enter start point:");
                    double start=sc.nextDouble();
                    System.out.println("Enter end point:");
                    double end=sc.nextDouble();
                    double distance = GeoUtils.calculateDistance(start, end);
                    double totalFare = calculator.calculateFare(distance);
                    if(peak){
                        totalFare+=20;
                    }
                    passengers.add(new Passenger(route,totalFare,peak));
                    break;
                case 3:
                    service.stream().filter(s->(s instanceof EmergencyService)).forEach(s ->System.out.println("🚑 Priority Service: " + s.getName()));
                    break;
                case 4:
                    passengers.stream().collect(Collectors.groupingBy(p->p.route)).forEach((r,p)->System.out.println(r+" -> "+p.size()));
                    passengers.stream().collect(Collectors.partitioningBy(p -> p.peakTime)).forEach((k, v) ->System.out.println(k ? "Peak" : "Non-Peak" + " Trips: " + v.size()));
                    DoubleSummaryStatistics stats=passengers.stream().collect(Collectors.summarizingDouble(p->p.fare));
                    System.out.println("Total Revenue: "+stats.getSum());
                    System.out.println("Average Fare: "+stats.getAverage());
                    break;
                case 0:
                    System.out.println("Thanks for using !");
                    return;
                default:
                    System.out.println("Please enter the valid option!");
            }
            
        }
    }
}




















