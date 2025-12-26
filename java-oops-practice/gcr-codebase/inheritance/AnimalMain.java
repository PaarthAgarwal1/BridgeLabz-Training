// Parent class
class Animal{
    String name;
    int age;
    // Constructor 
    Animal(String name,int age) {
        this.name=name;
        this.age=age;
    }
    // Method for displaying sound
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
// Child class
class Dog extends Animal{
    Dog(String name,int age){
        super(name, age); // using parent class constructor with super keyword
    }
    //Override the parent class method in the child class
    @Override
    void makeSound(){
        System.err.println(name+" Says: Woof woof!");
    }
}

class Cat extends Animal{
    Cat(String name,int age){
        super(name, age); // using parent class constructor with super keyword
    }
    //Override the parent class method in the child class
    @Override
    void makeSound(){
        System.err.println(name+" Says: Meow!");
    }
}

class Bird extends Animal{
    Bird(String name,int age){
        super(name, age); // using parent class constructor with super keyword
    }
    //Override the parent class method in the child class
    @Override
    void makeSound(){
        System.err.println(name+" Says: Chirp Chirp !");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        // creating instances of different animals
        Animal d= new Dog("Goldy", 3);
        Animal c= new Cat("Whisky", 2);
        Animal b= new Bird("peo", 1);

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
