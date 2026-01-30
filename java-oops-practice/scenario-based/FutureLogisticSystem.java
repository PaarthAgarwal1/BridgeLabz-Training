import java.util.Scanner;

// Abstract parent class for all transport types
abstract class GoodsTransport {

    // Common properties
    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    // Constructor to initialize common fields
    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    // Getter methods
    public String getTransportId() {
        return transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public int getRating() {
        return transportRating;
    }

    // Abstract methods to be implemented by child classes
    abstract public String vehicleSelection();
    abstract public float calculateTotalCharge();
}

// Brick transport implementation
class BrickTransport extends GoodsTransport {

    // Brick specific properties
    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    // Constructor
    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    // Getter methods
    public float getBrickSize() {
        return brickSize;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    // Setter methods
    public void setBrickSize(float brickSize) {
        this.brickSize = brickSize;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
    }

    public void setBrickPrice(float brickPrice) {
        this.brickPrice = brickPrice;
    }

    // Decide vehicle based on brick quantity
    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        } else if (brickQuantity >= 300 && brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    // Calculate total transport charge
    @Override
    public float calculateTotalCharge() {

        // Get selected vehicle
        String vehicle = vehicleSelection();
        float vehiclePrice = 0;

        // Vehicle cost
        switch (vehicle) {
            case "Truck":
                vehiclePrice = 1000;
                break;
            case "Lorry":
                vehiclePrice = 1700;
                break;
            case "MonsterLorry":
                vehiclePrice = 3000;
                break;
        }

        // Discount based on rating
        int discountPercentage;
        if (transportRating == 5) {
            discountPercentage = 20;
        } else if (transportRating == 3 || transportRating == 4) {
            discountPercentage = 10;
        } else {
            discountPercentage = 0;
        }

        // Calculate price, tax and discount
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;
        float discount = price * (discountPercentage / 100.0f);

        // Final total charge
        float totalCharge = price + tax + vehiclePrice - discount;
        return totalCharge;
    }
}

// Timber transport implementation
class TimberTransport extends GoodsTransport {

    // Timber specific properties
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    // Constructor
    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius, String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    // Getter methods
    public float getTimberLength() {
        return timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    // Setter methods
    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }

    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }

    // Decide vehicle based on timber surface area
    @Override
    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250) {
            return "Truck";
        } else if (area >= 250 && area <= 400) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    // Calculate total transport charge
    @Override
    public float calculateTotalCharge() {

        // Get selected vehicle
        String vehicle = vehicleSelection();
        float vehiclePrice = 0;

        // Vehicle cost
        switch (vehicle) {
            case "Truck":
                vehiclePrice = 1000;
                break;
            case "Lorry":
                vehiclePrice = 1700;
                break;
            case "MonsterLorry":
                vehiclePrice = 3000;
                break;
        }

        // Discount based on rating
        int discountPercentage;
        if (transportRating == 5) {
            discountPercentage = 20;
        } else if (transportRating == 3 || transportRating == 4) {
            discountPercentage = 10;
        } else {
            discountPercentage = 0;
        }

        // Volume calculation
        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        // Price based on timber type
        float price = timberPrice * volume *
                (timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f);

        // Tax and discount
        float tax = price * 0.3f;
        float discount = price * discountPercentage / 100.0f;

        // Final total charge
        float totalCharge = price + vehiclePrice + tax - discount;
        return totalCharge;
    }
}

// Utility class for validation and object creation
class Utility {

    // Validate transport ID using regex
    public static boolean validateTransportId(String transportId) {
        if (transportId == null || !transportId.matches("RTS\\d{3}[A-Z]")) {
            System.out.println("Transport Id " + transportId + " is invalid");
            return false;
        } else {
            return true;
        }
    }

    // Parse input string and create appropriate object
    public static GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");
        String transportId = data[0];

        // Validate ID
        if (!validateTransportId(transportId)) {
            return null;
        }

        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String transportType = data[3];

        // Create BrickTransport object
        if (transportType.equalsIgnoreCase("BrickTransport")) {
            float brickSize = Float.parseFloat(data[4]);
            int brickQuantity = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);
            return new BrickTransport(transportId, date, rating,
                    brickSize, brickQuantity, brickPrice);
        }

        // Create TimberTransport object
        else if (transportType.equalsIgnoreCase("TimberTransport")) {
            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);
            return new TimberTransport(transportId, date, rating,
                    timberLength, timberRadius, timberType, timberPrice);
        }

        return null;
    }

    // Identify object type
    public static String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        } else if (goodsTransport instanceof BrickTransport) {
            return "BrickTransport";
        }
        return "";
    }
}

// Main class
public class FutureLogisticSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        // Parse input
        GoodsTransport transport = Utility.parseDetails(input);

        if (transport == null) {
            return;
        }

        // Identify transport type
        String type = Utility.findObjectType(transport);

        // Display common details
        System.out.println("\nTransporter id : " + transport.getTransportId());
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getRating());

        // Display BrickTransport details
        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        }

        // Display TimberTransport details
        if (type.equals("TimberTransport")) {
            TimberTransport tt = (TimberTransport) transport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        // Final output
        System.out.println("Vehicle for transport : " + transport.vehicleSelection());
        System.out.println("Total charge : " + transport.calculateTotalCharge());
    }
}
