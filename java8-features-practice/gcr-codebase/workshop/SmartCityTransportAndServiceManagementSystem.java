
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        service.stream().filter(s->!(s is instanceof EmergencyService)).sorted((s1,s2)->)
    }
}




















