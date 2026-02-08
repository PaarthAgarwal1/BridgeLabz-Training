
import java.util.ArrayList;
import java.util.List;

class PrintJob implements  Runnable{
    private String jobName;
    private int pages;
    private int priority;

    private static final Object PRINTER=new Object();

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }
    private String getPriorityLabel(int priority) {
        if (priority >= 7) return "High Priority";
        if (priority >= 5) return "Medium Priority";
        return "Low Priority";
    }
    @Override
    public void run(){
        String priorityLabel=getPriorityLabel(priority);
        synchronized (PRINTER) {
            for(int i=1;i<=pages;i++){
                System.out.println("["+priorityLabel+"] Printing "+jobName+" - Page "+i+" of "+pages);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(jobName + " completed.\n");
        }
    }
    
}

public class PrintShopJobScheduler {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Starting print jobs...\n");
        long startTime=System.currentTimeMillis();

        Thread t1=new Thread(new PrintJob("Job1", 10, 5), "Job1");
        Thread t2=new Thread(new PrintJob("Job2", 5, 8), "Job2");
        Thread t3=new Thread(new PrintJob("Job3", 15, 3), "Job3");
        Thread t4=new Thread(new PrintJob("Job4", 8, 6), "Job4");
        Thread t5=new Thread(new PrintJob("Job5", 12, 7), "Job5");

        t1.setPriority(5);
        t2.setPriority(8);
        t3.setPriority(3);
        t4.setPriority(6);
        t5.setPriority(7);

        List<Thread> jobs=new ArrayList<>();
        jobs.add(t1);
        jobs.add(t2);
        jobs.add(t3);
        jobs.add(t4);
        jobs.add(t5);

        for(Thread t:jobs){
            t.start();
        }

        for(Thread t:jobs){
            t.join();
        }

        long endTime=System.currentTimeMillis();
        System.out.println("All jobs completed in "+(endTime-startTime)+" ms");
    }
    
}
