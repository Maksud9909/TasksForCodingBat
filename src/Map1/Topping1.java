package Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        Map<String,String> result = new HashMap<>();
        result.put("bread", "butter");
        if (map.containsKey("ice cream")){
            result.put("ice cream","cherry");
            result.putAll(map);
        } else {
            result.putAll(map);
        }
        return result;
    }

}
