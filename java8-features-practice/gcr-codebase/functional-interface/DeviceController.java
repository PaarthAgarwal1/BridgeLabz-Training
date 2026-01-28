interface Controller {
    void turnOn();
    void turnOff();
}

class AC implements Controller {

    @Override
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

class Lights implements Controller {

    @Override
    public void turnOn() {
        System.out.println("Lights are turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are turned OFF");
    }
}

class TV implements Controller {

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

public class DeviceController {
    public static void main(String[] args) {

        Controller ac = new AC();
        Controller lights = new Lights();
        Controller tv = new TV();

        ac.turnOn();
        lights.turnOn();
        tv.turnOn();

        ac.turnOff();
        lights.turnOff();
        tv.turnOff();
    }
}