class Chef extends Thread{
    private String dish;
    private int time;

    public Chef(String chefName, String dish, int time) {
        super(chefName);
        this.dish = dish;
        this.time = time;
    }
    
    @Override
    public void run(){
        System.out.println(getName()+" started preparing "+dish);
        try {
            int stepTime=time/4;
            for(int progress=25;progress<=100;progress+=25){
                Thread.sleep(stepTime);
                System.out.println(getName()+" preparing "+dish+" : "+progress+"% complete");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class RestaurantManager {
    public static void main(String[] args) throws InterruptedException{
        Chef c1 = new Chef("Chef-1", "Pizza", 3000);
        Chef c2 = new Chef("Chef-2", "Pasta", 2000);
        Chef c3 = new Chef("Chef-3", "Salad", 1000);
        Chef c4 = new Chef("Chef-4", "Burger", 2500);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        // Manager waits for all chefs
        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
