
import java.util.Random;

class FileDownloaderThread extends Thread{
    String fileName;
    Random random=new Random();

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void run(){
        try {
            for(int progress=0;progress<=100;progress+=10){
                System.out.println("{"+Thread.currentThread().getName()+"] Downloading "+fileName+": "+progress+"%");
                Thread.sleep(200+random.nextInt(300));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class DownloadMAnagerThread {
    public static void main(String[] args) throws InterruptedException {
        FileDownloaderThread t1=new FileDownloaderThread("Document.pdf");
        FileDownloaderThread t2=new FileDownloaderThread("Image.jpg");
        FileDownloaderThread t3=new FileDownloaderThread("Video.mp4");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.err.println("All download complete!");
    }
    
}
