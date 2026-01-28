interface VehicleDashboard{
    void displaySpeed(int speed);
    // New feature added later (only for EVs)
    default void displayBatteryPercentage(){
        System.out.println("Battery information not available for this vehicle.");
    }
}
class PetrolCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}
class ElectricCar implements VehicleDashboard {

    private int batteryPercentage;

    ElectricCar(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery Level: " + batteryPercentage + "%");
    }
}
public class SmartVehicleDashboard {
    public static void main(String[] args) {


        VehicleDashboard petrolCar = new PetrolCar();
        VehicleDashboard electricCar = new ElectricCar(78);


        petrolCar.displaySpeed(90);
        petrolCar.displayBatteryPercentage();


        electricCar.displaySpeed(100);
        electricCar.displayBatteryPercentage();
    }
}
