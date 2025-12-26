// Defining the GPS interface
interface GPS {
    // Getting current location coordinates
    String getCurrentLocation();
    
    // Updating the location
    void updateLocation(String newLoc);
}

// Defining the abstract Vehicle class
abstract class Vehicle {
    // Encapsulating vehicle details
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getting the rate
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Calculating fare abstractly
    abstract double calculateFare(double distance);

    // Displaying vehicle details
    void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
    }
}

// Extending for Car
class Car extends Vehicle implements GPS {
    String currentLocation = "Garage";

    Car(String id, String driver) {
        super(id, driver, 15.0);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLoc) {
        this.currentLocation = newLoc;
        System.out.println("Car moved to: " + newLoc);
    }
}

// Extending for Auto
class Auto extends Vehicle {
    Auto(String id, String driver) {
        super(id, driver, 10.0);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Extending for Bike
class Bike extends Vehicle {
    Bike(String id, String driver) {
        super(id, driver, 5.0);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Executing the ride application
public class RideHailingApp {
    // Demonstrating polymorphism
    static void bookRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        double fare = v.calculateFare(distance);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: $" + fare);
        
        // Checking for GPS capability
        if (v instanceof GPS) {
            ((GPS) v).updateLocation("Customer Pickup Point");
        }

        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        // Creating vehicles
        Car car = new Car("CAR-123", "Mike");
        Auto auto = new Auto("AUTO-456", "Raj");
        Bike bike = new Bike("BIKE-789", "Sam");

        bookRide(car, 10.5);
        bookRide(auto, 5.0);
        bookRide(bike, 3.2);
    }
}
