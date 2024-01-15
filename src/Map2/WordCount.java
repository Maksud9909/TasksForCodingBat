package Map2;


import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        Map<String,Integer> wordCounts = new HashMap<>();
        wordCounts.put("Maksud",12);
        wordCounts.put("Murod",34);
        wordCounts.put("Anton",45);

    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> wordCounts = new HashMap<>();

        for (String str:strings){
            wordCounts.put(str,wordCounts.getOrDefault(str,0)+1);
        }
        return wordCounts;
    }

}
