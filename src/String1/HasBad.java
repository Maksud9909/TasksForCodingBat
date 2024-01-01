package String1;

public class HasBad {
    public boolean hasBad (String str){
        if (str.substring(0).startsWith("bad")){
            return true;
        }else if (str.equals("")){
            return false;
        }else if (str.substring(1).startsWith("bad")){
            return true;
        }else {
            return false;
        }
    }
}
