
import java.util.Scanner;

// MobilePhone class to store and display phone details
class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor to initialize phone attributes
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the brand name : ");
        String brand=sc.nextLine();
        System.out.print("Enter the model name : ");
        String model=sc.nextLine();
        System.out.print("Enter the price : ");
        double prie=sc.nextDouble();
        MobilePhone phone = new MobilePhone(brand,model,prie); // create phone object
        phone.displayDetails();
    }
}