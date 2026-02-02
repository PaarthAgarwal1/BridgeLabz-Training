import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String paragraph = "Java streams make java code concise and java code powerful";
        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Integer> wordFrequency =words.stream()
            .collect(Collectors.toMap(
                word -> word,          // key mapper
                word -> 1,             // value mapper
                Integer::sum           // merge function
            ));

        System.out.println("Word Frequency:");
        wordFrequency.forEach((word, count) ->System.out.println(word + " : " + count));
    }
}
