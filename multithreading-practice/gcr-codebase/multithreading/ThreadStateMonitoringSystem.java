
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TaskRunner extends Thread{

    public TaskRunner(String name) {
        super(name);
    }
    @Override
    public void run(){
        try {
            for(int i=0;i<5;i++){
                Thread.sleep(300);
            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(getName()+"interrupted");
        }
    }
}
class StateMoniter extends Thread{
    private Thread[] threads;
    private Map<String,Set<Thread.State>> stateHistory=new HashMap<>();

    public StateMoniter(Thread[] threads) {
        this.threads = threads;
        for(Thread t:threads){
            stateHistory.put(t.getName(), new HashSet<>());
        }
    }
    @Override
    public void run(){
        boolean allTerminated;
        try {
            do { 
                allTerminated=true;
                for(Thread t:threads){
                    Thread.State state=t.getState();
                    stateHistory.get(t.getName()).add(state);
                    System.out.println("[Moniter] "+t.getName()+" is in "+state+" state at "+LocalTime.now());
                    if(state!=Thread.State.TERMINATED){
                        allTerminated=false;
                    }
                }
                Thread.sleep(500);
                System.out.println();
            } while (!allTerminated);
            
        } catch (InterruptedException e) {
            System.out.println("Monitor interrupted");
        }
        System.out.println("----- Summary -----");
        for (String name : stateHistory.keySet()) {
            System.out.println("Summary: " + name +" went through " + stateHistory.get(name).size() +" states -> " + stateHistory.get(name));
        }
    }
    

}

public class ThreadStateMonitoringSystem {
    public static void main(String[] args) throws InterruptedException{
        TaskRunner t1=new TaskRunner("Task-1");
        TaskRunner t2=new TaskRunner("Task-2");

        Thread[] tasks={t1,t2};
        StateMoniter moniter=new StateMoniter(tasks);
        moniter.start();
        Thread.sleep(100);
        t1.start();
        t2.start();
    }
    
}
