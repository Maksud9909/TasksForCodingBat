package String1;

public class withoutX2 {
    public String withoutX2(String str) {
        if (str.substring(0,1).equals("x")){
            return str.substring(1);
        } else if (str.substring(1,2).equals("x")) {
            return str.substring(2);
        } else if (str.substring(0,2).equals("xx")) {
            return str.substring(3);
        }
        return str;
    }
}
