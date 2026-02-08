
import java.util.Random;

class FileDownloadRunable implements Runnable{
    private String fileName;
    private Random random=new Random();

    public FileDownloadRunable(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void run(){
        try {
            for(int progress=0;progress<=100;progress+=10){
                System.err.println("["+Thread.currentThread().getName()+"] Downloading "+fileName+": "+progress+"%");
                Thread.sleep(200+random.nextInt(300));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class DownloadManagerRunable {
    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(new FileDownloadRunable("Document.pdf"));
        Thread t2=new Thread(new FileDownloadRunable("Image.jpg"));
        Thread t3=new Thread(new FileDownloadRunable("Video.mp4"));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All download complete!");
    }
    
}
