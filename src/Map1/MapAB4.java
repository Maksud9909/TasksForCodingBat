package Map1;

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a").length() > map.get("b").length()){
            map.put("c",map.get("a"));
        }
        if (map.containsKey("b") && map.get("b").length() > map.get("a").length()){
            map.put("c",map.get("b"));
        }
        if (map.get("b").length() == map.get("a").length()){
            map.put("a","");
            map.put("b","");
        }
        return map;
    }

}
