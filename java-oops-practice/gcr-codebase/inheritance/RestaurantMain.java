// Parent Class
class Person {
    String name;
    int id;

    //Constructor for Person details
    Person(String name, int id) {
        this.name= name;
        this.id= id;
    }
}

// Interface for worker
interface Worker {
    void performDuties();
}

// Chef class inheriting Person class and implementing Worker interface
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty= specialty;
    }

    // Method to display the duties for a chef
    public void performDuties() {
        System.out.println("Chef "+ name +" is cooking "+ specialty+ " dishes");
    }
}

//Waiter class inheriting Person class and implementing Worker interface
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned= tablesAssigned;
    }

    // Method to display the duties for a waiter
    public void performDuties() {
        System.out.println("Waiter "+ name+ " is serving "+ tablesAssigned+ " tables.");
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        // creating chef and waiter objects
        Chef chef= new Chef("Gordon", 1, "Italian");
        Waiter waiter= new Waiter("Harry", 2, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}