package Warmup2;

public class StringYak {
    public String stringYak(String str) {
        String result = null;
        if (str.contains("yak")){
            result = str.replace("yak","");
        }
        return result;
    }

}
