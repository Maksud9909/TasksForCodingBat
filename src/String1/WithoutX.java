package String1;

public class WithoutX {
    public static String withoutX(String str) {
        if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        } else if (str.length() > 0 && str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }
}
