
class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
    }
}
