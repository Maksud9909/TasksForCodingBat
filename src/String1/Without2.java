package String1;

public class Without2 {
    public static void main(String[] args) {


    }
    public String without2(String str) {
        if (str.substring(0,2).equals(str.length()-2)){
            return str.substring(2);
        }
            return str;
    }

}
