package String1;

public class withoutX2 {
    public String withoutX2(String str) {
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x'){
            str.valueOf(str.charAt(2));
        }else if (str.charAt(0) == 'x'){
            str.valueOf(str.charAt(1));
        } else if (str.charAt(1) == 'x') {
            str.valueOf(str.charAt(2));
        }
        return str;
    }
}
