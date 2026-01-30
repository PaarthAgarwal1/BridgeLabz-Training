import java.util.Scanner;

// Custom exception for invalid flight details
class InvalidFlightException extends Exception {
    public InvalidFlightException(String message) {
        super(message);
    }
}

// Utility class containing validation and calculation logic
class FlightUtil {

    // Validates flight number format: FL-XXXX (1000–9999)
    public static boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
        if (flightNumber == null || !flightNumber.matches("^FL-[1-9]\\d{3}$")) {
            throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
        }
        return true;
    }

    // Validates flight name (case-insensitive check)
    public static boolean validateFlightName(String flightName) throws InvalidFlightException {
        if (flightName != null &&
                (flightName.equalsIgnoreCase("SpiceJet") ||
                 flightName.equalsIgnoreCase("IndiGo") ||
                 flightName.equalsIgnoreCase("Vistara") ||
                 flightName.equalsIgnoreCase("Air Arabia"))) {
            return true;
        }
        throw new InvalidFlightException("The flight name " + flightName + " is invalid");
    }

    // Validates passenger count based on flight name
    public static boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {

        if (flightName.equalsIgnoreCase("SpiceJet") && passengerCount > 0 && passengerCount <= 396)
            return true;
        else if (flightName.equalsIgnoreCase("IndiGo") && passengerCount > 0 && passengerCount <= 230)
            return true;
        else if (flightName.equalsIgnoreCase("Vistara") && passengerCount > 0 && passengerCount <= 615)
            return true;
        else if (flightName.equalsIgnoreCase("Air Arabia") && passengerCount > 0 && passengerCount <= 130)
            return true;
        else
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount + " is invalid for " + flightName);
    }

    // Calculates fuel required to fill the tank
    public static double calculateFuelToFillTank(String flightName, double currentFuelLevel)
            throws InvalidFlightException {

        double tankCapacity = 0;

        // Assign tank capacity based on flight name
        switch (flightName) {
            case "SpiceJet":
                tankCapacity = 200000;
                break;
            case "Vistara":
                tankCapacity = 300000;
                break;
            case "IndiGo":
                tankCapacity = 250000;
                break;
            case "Air Arabia":
                tankCapacity = 150000;
                break;
        }

        // Validate fuel level
        if (currentFuelLevel < 0 || currentFuelLevel > tankCapacity) {
            throw new InvalidFlightException("Invalid fuel level for " + flightName);
        }

        // Return fuel needed to fill the tank
        return tankCapacity - currentFuelLevel;
    }
}

// Main class to run the application
public class AeroVigilSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight details");
        String input = sc.nextLine();

        try {
            // Split input into fields
            String[] data = input.split(":");

            String flightNumber = data[0];
            String flightName = data[1];
            int passengerCount = Integer.parseInt(data[2]);
            double currentFuelLevel = Double.parseDouble(data[3]);

            // Validate input details
            FlightUtil.validateFlightNumber(flightNumber);
            FlightUtil.validateFlightName(flightName);
            FlightUtil.validatePassengerCount(passengerCount, flightName);

            // Calculate required fuel
            double fuelToFill =
                    FlightUtil.calculateFuelToFillTank(flightName, currentFuelLevel);

            // Display result
            System.out.println("Fuel required to fill the tank: " + fuelToFill + " liters");

        } catch (InvalidFlightException e) {
            // Display validation error message
            System.out.println(e.getMessage());
        }
    }
}
