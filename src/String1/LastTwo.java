package String1;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() >=2){
            String preLast = str.substring(str.length() - 2,str.length()-1);
            String last = str.substring(str.length() - 1);
            return str.substring(0,str.length() - 2) + last + preLast;
        }
        else {
            return str;

        }
    }


    public String lastTwo1(String str) {
        if (str.length() > 1) {
            char secondLastChar = str.charAt(str.length() - 2);
            char lastChar = str.charAt(str.length() - 1);
            return str.substring(0, str.length() - 2) + lastChar + secondLastChar;
        } else {
            return str;
        }
    }


}
