package Map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str:strings){
            map.put(str.substring(0,1),str.substring(str.length() - 1));
        }
        return map;
    }

}
