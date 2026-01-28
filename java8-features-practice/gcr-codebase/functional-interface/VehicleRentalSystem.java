interface RentalSystem{
    void rent();
    void returnVehicle();
}

class Car implements RentalSystem{

    @Override
    public void rent() {
        System.out.println("Car has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

class Bike implements RentalSystem{

    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

class Bus implements RentalSystem{

    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalSystem car = new Car();
        RentalSystem bike = new Bike();
        RentalSystem bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
    
}
