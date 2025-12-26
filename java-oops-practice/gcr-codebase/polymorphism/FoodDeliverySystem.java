// Interface that defines discount-related methods
interface Discountable {

    // Method to reduce amount using discount percentage
    double applyDiscount(double amount, double percent);

    // Method to show discount information
    void getDiscountDetails();
}

// Abstract class for food items
abstract class FoodItem {

    // Basic details of a food item
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to set food item values
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Returns item name
    public String getItemName() {
        return itemName;
    }

    // Returns price of item
    public double getPrice() {
        return price;
    }

    // Returns quantity ordered
    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total cost (implemented by child classes)
    abstract double calculateTotalPrice();

    // Prints basic food item details
    void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Class for vegetarian food items
class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Total price for veg items
    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Apply normal discount
    @Override
    public double applyDiscount(double amount, double percent) {
        return amount - (amount * percent / 100);
    }

    // Display veg discount message
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: Veg items special offer");
    }
}

// Class for non-vegetarian food items
class NonVegItem extends FoodItem implements Discountable {

    // Extra charge for packing
    private double packagingCharge = 5.0;

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Total price including packaging charge
    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + packagingCharge;
    }

    // Apply reduced discount for non-veg items
    @Override
    public double applyDiscount(double amount, double percent) {
        return amount - (amount * (percent - 2) / 100);
    }

    // Display non-veg discount message
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: Non-veg standard offer");
    }
}


public class FoodDeliverySystem {

    // Method to handle order processing
    static void processOrder(FoodItem item) {
        System.out.println("----- Order Summary -----");
        item.getItemDetails();

        double total = item.calculateTotalPrice();
        System.out.println("Total Price: $" + total);

        // Check if discount is applicable
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            d.getDiscountDetails();

            double finalAmount = d.applyDiscount(total, 10);
            System.out.println("Final Price After Discount: $" + finalAmount);
        }
    }

    public static void main(String[] args) {

        // Creating food items
        VegItem vegFood = new VegItem("Veg Sandwich", 10.0, 2);
        NonVegItem nonVegFood = new NonVegItem("Chicken Burger", 20.0, 1);

        processOrder(vegFood);
        processOrder(nonVegFood);
    }
}
