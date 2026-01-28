
public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable backgroundTask=()->{
            System.out.println("Background Job is Running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background Job Completed.");
        };

        Thread jobThread=new Thread(backgroundTask);
        jobThread.start();
        System.out.println("Main Thread is Free to Perform Other Tasks...");
    }    
}
