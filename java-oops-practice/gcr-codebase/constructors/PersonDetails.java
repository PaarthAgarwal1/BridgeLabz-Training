class Person {

    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDetails {
    public static void main(String[] args) {

        Person p1 = new Person("Paarth", 21);

        // Clone using copy constructor
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}
