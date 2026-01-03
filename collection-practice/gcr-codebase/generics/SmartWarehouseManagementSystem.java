
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItems{
    private String name;
    private double price;

    WarehouseItems(String name,double price) {
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public double  getPrice(){
        return price;
    }
    // Each item must define how it is displayed
    public abstract String getCategory();
}

class Electronics extends WarehouseItems{

    public Electronics(String name,double price) {
        super(name,price);
    }

    @Override
    public String getCategory(){
        return "Electronics";
    }
}

class Groceries extends WarehouseItems{
    public Groceries(String name,double price){
        super(name,price);
    }

    @Override
    public String getCategory(){
        return "Groceries";
    }
}

class Furniture extends WarehouseItems{

    public Furniture(String name,double price){
        super(name,price);
    }

    @Override
    public String getCategory(){
        return "Furniture";
    }
}
// Using Generics to crete the storage to store differnt type of items 
class Storage<T extends WarehouseItems>{
    private List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }
}

class WarehouseUtil{
    public static void displayItems(List<? extends WarehouseItems> items){
        for(WarehouseItems item:items){
            System.out.println(item.getCategory()+" | "+item.getName()+" | INR "+item.getPrice());;
        }
    }
}

public class SmartWarehouseManagementSystem {
   public static void main(String[] args) {

        // Storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 70000));
        electronicsStorage.addItem(new Electronics("Mobile", 30000));

        // Storage for Groceries
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 60));
        groceryStorage.addItem(new Groceries("Milk", 40));

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500));
        furnitureStorage.addItem(new Furniture("Table", 6000));

        System.out.println("Electronics:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    } 
}

