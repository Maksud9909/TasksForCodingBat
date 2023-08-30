package String2;

import java.awt.font.ShapeGraphicAttribute;

public class CountCode {
    public static void main(String[] args) {
        String name = "Maksud";
        String subStr = name.substring(0,1);
        System.out.println(subStr);
    }

    public int countCode(String str) {
        int len = str.length();
        int counter = 0;
        String co = "co";
        String e = "e";
        if (len < 4){
            return 0;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (co.compareTo(str.substring(i,i+2)) == 0
                    && e.compareTo(str.substring(i+3,i+4)) == 0) {
                counter++;
            }
        }
        return counter;
    }
}
