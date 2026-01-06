class Animal{
    void sound(){
        System.out.println("animal sound !");
    }
}

final class Dog extends Animal {
    @Override
    final void sound(){
        System.out.println("Dog sound !");
    }
}

public class UseOfFinally {
    static  final int maxRating=5;
    
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.sound();
        System.out.println(maxRating);
        
    }
}


