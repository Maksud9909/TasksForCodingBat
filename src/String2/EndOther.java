package String2;

public class EndOther {
    public boolean endOther(String first, String second) {
        if (second.toLowerCase().endsWith(first.toLowerCase())){
            return true;
        }else if (first.toLowerCase().endsWith(second.toLowerCase())){
            return false;
        }else {
            return false;
        }
    }

}
