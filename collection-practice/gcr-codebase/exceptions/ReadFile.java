
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) {
        //Reading file
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            
        } catch (IOException e) {
            //File not found or read error
            System.out.println("File not found ");
        }
    }
}
