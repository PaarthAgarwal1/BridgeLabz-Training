import java.util.*;
import java.io.*;
public class Comparision {
    public static void compareString(){
        String text="hello";
        int iteration=1_000_000;

        long startBuilderTime=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<iteration;i++){
            sb.append(text);
        }
        long endBuilderTime=System.currentTimeMillis();
        
        long startBufferTime=System.currentTimeMillis();
        StringBuffer sbuf=new StringBuffer();
        for(int i=0;i<iteration;i++){
            sbuf.append(text);
        }
        long endBufferTime=System.currentTimeMillis();
        System.out.println("---- String Comparison ----");
        System.out.println("StringBuilder Time: " + (endBuilderTime - startBuilderTime) + " ms");
        System.out.println("StringBuffer Time : " + (endBufferTime - startBufferTime) + " ms");
    }
    public static void compareFileReaders(String filePath) {

        // FileReader test
        long startFR = System.currentTimeMillis();
        int countFR = countWordsUsingFileReader(filePath);
        long endFR = System.currentTimeMillis();

        // InputStreamReader test
        long startISR = System.currentTimeMillis();
        int countISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.currentTimeMillis();

        System.out.println("\n---- File Reading Comparison ----");
        System.out.println("FileReader Word Count       : " + countFR);
        System.out.println("FileReader Time             : " + (endFR - startFR) + " ms");

        System.out.println("InputStreamReader Word Count: " + countISR);
        System.out.println("InputStreamReader Time      : " + (endISR - startISR) + " ms");
    }

    // Count words using FileReader
    private static int countWordsUsingFileReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        return count;
    }

    // Count words using InputStreamReader
    private static int countWordsUsingInputStreamReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        return count;
    }

    public static void main(String[] args) {
        compareString();

        String filePath = "largefile.txt";
        compareFileReaders(filePath);
    }
}
