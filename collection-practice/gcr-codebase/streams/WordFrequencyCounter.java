
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String fileName = "input.txt";
        HashMap <String,Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i=0;
            while((line =br.readLine())!=null){
                line=line.toLowerCase();
                line=line.replaceAll("[^a-zA-Z0-9 ]", "");
                String[] words=line.split("\\s+");
                for(String word:words){
                    if(!word.isEmpty()){
                        wordCount.put(word,wordCount.getOrDefault(word,0)+1);
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error reading the file. ");
            e.printStackTrace();
            return;
        }

        List<Map.Entry<String,Integer>> list=new ArrayList<>(wordCount.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        System.out.println("Top 5 most frequent words:");
        for(int i=0;i<Math.min(5,list.size());i++){
            Map.Entry<String,Integer> entry = list.get(i);
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
