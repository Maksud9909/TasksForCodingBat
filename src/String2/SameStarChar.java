package String2;

import java.lang.ref.SoftReference;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            i++;
            if (str.charAt(i) == '*'){
                if (str.charAt(i-1) == str.charAt(i+1)){
                    result = true;
                }
            }
        }
        return result;
    }

}
