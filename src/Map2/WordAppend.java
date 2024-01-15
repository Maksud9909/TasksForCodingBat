package Map2;


import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        for (String word : strings) {
            map.put(word, map.getOrDefault(word, 0) + 1);

            // Проверяем, появляется ли текущее слово второй, четвёртый, шестой и так далее раз
            if (map.get(word) % 2 == 0) {
                result.append(word);
            }
        }

        return result.toString();
    }

}
