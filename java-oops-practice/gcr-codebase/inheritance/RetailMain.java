import java.util.Date;

// Parent Order Class
class Order {
    int orderId;
    Date orderDate;

    // Constructor for basic order details
    Order(int orderId) {
        this.orderId= orderId;
        this.orderDate= new Date(); // current date
    }

    // getting the status
    String getOrderStatus() {
        return "Order Placed";
    }
}

// extending Order to ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor for shipped order details
    ShippedOrder(int orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber= trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Shipped (Tracking: "+ trackingNumber+ ")";
    }
}

// extending ShippedOrder to DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;

    // Constructor for delivered order details
    DeliveredOrder(int orderId, String trackingNumber) {
        super(orderId, trackingNumber);
        this.deliveryDate = new Date();
    }

    @Override
    String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

public class RetailMain {
    public static void main(String[] args) {
        // creating a delivered order object
        DeliveredOrder finalOrder= new DeliveredOrder(5501, "TRK-998877");

        System.out.println("Order ID: "+ finalOrder.orderId);
        System.out.println("Status: "+ finalOrder.getOrderStatus());
    }
}