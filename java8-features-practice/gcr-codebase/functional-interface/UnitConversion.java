interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
public class UnitConversion {
    public static void main(String[] args) {
        double kilometers = 10.0;
        double miles = UnitConverter.kmToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        double kilograms = 5.0;
        double pounds = UnitConverter.kgToLbs(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");
    }
}
